package oop.zoo;

public class Bird extends Animal {

    /**
     * @param name
     * @param age
     * @param weigth
     */
    public Bird(String name, int age, float weigth) {
        super(name, age, weigth);
    }

    @Override
    public void move() {
        System.out.println("Birds moves flapping wings...!");
    }

}
