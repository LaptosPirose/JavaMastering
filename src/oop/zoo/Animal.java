package oop.zoo;

public abstract class Animal {
    private String name;
    private int age;
    private float weigth;

    /**
     * @param name
     * @param age
     * @param weigth
     */
    public Animal(String name, int age, float weigth) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return this.age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * @param weigth
     */
    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    /**
     * @return this.weigth
     */
    public float getWeigth() {
        return this.weigth;
    }

    /**
     * Abstract method
     */
    public abstract void move();

}
