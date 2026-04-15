package oop.zoo;

public class Dog extends Animal {
    /**
     * @param name
     * @param age
     * @param weigth
     */
    public Dog(String name, int age, float weigth) {
        super(name, age, weigth);
    }

    @Override
    public void move() {
        System.out.println("Dog moves walking..!");
    }

}
