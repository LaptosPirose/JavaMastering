package oop.zoo;

public class Sparrow extends Bird implements Flyable {

    /**
     * @param name
     * @param age
     * @param weigth
     */
    public Sparrow(String name, int age, float weigth) {
        super(name, age, weigth);
    }

    @Override
    public void fly() {
        System.out.println("Sparrows flying high...!");
    }

}
