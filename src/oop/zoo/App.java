package oop.zoo;

public class App {
    public static void main(String[] args) {

        Dog brutus = new Dog("Brutus", 5, 5.6f);
        System.out.println(brutus.getName());

        Chicken chickenOne = new Chicken("Cocka", 2, 10);
        chickenOne.fly();
        chickenOne.move();

        Sparrow sparrowOne = new Sparrow("Cricket", 10, 2);
        sparrowOne.fly();
        sparrowOne.move();

        printSome(chickenOne);
        System.out.println(chickenOne.getAge());
    }

    public static void printSome(Animal args) {
        args.move();
        System.out.println(args.getAge());
        System.out.println("got in");
    }
}
