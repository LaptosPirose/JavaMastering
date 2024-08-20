package zoo_exercise;

public class Bird extends Animal implements Flyable {
    public Bird(int age, String gender, int weigthInLbs) {
        super(age, gender, weigthInLbs);

    }

    @Override
    public void fly() {
        System.out.println("Birds fly...");
    }

    @Override
    public void move() {
        System.out.println("Birds are flying...");
    }
}
