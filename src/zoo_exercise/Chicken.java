package zoo_exercise;

public class Chicken extends Animal{

    public Chicken(int age, String gender, int weigthInLbs) {
        super(age, gender, weigthInLbs);
    }

    public void move(){
        System.out.println("Chickens lay eggs...");
    }

}
