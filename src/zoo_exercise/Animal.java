package zoo_exercise;

public abstract class Animal {
    public int age;
    public String gender;
    public int weigthInLbs;

    public Animal(int age, String gender, int weigthInLbs) {
        this.age = age;
        this.gender = gender;
        this.weigthInLbs = weigthInLbs;

    }

    public void eat() {
        System.out.println("The animal is eating...");
    }

    public void sleep() {
        System.out.println("The animal is sleeping...");
    }

    public abstract void move();
}
