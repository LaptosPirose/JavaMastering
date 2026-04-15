package oop.zoo;

public class Chicken extends Bird implements Flyable {

    /**
     * @param name
     * @param age
     * @param weigth
     */
    public Chicken(String name, int age, float weigth) {
        super(name, age, weigth);
    }

    @Override
    public void fly() {
        System.out.println("Chickens are not able to fly..!");
    }

}
