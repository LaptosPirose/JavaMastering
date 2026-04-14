package zoo;

public class Zoo {
	public static void main(String[] args) {
		Bird birdOne = new Bird(10, "M", 2);
		birdOne.eat();
		// birdOne.fly(); Doesn't exixts in Bird Type

		Chicken chickenOne = new Chicken(1, "F", 2);
		chickenOne.fly();

		Animal sparrowOne = new Sparrow(1, "F", 10);
		sparrowOne.move();
		// sparrowOne.fly(); Doesn't exists in Animal type

		Sparrow sparrowTwo = new Sparrow(2, "M", 5);
		sparrowTwo.fly();

		Fish fishOne = new Fish(3, "M", 4);

		moveAnimal(sparrowTwo);
		moveAnimal(chickenOne);
		moveAnimal(fishOne);

		Flyable chickenTwo = new Chicken(1, "F", 2);
		chickenTwo.fly(); // There is only visibility to one method

		// Flyable sparrowThree = new Bird(2, "M", 2); Is not possible because Bird
		// doesn't implement Flyable

	}

	public static void moveAnimal(Animal animal) {
		animal.move();
	}
}
