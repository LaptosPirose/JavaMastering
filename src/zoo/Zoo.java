package zoo;

public class Zoo {

	public static void main(String[] args) {
//		Animal animal = new Animal(10,"M", 20);
//
//		animal.eat();
//		animal.sleep();
		
		Bird bird1 = new Bird(10, "F", 10);
		Animal bird2 = new Bird(1,"F", 2);
		
		
		Chicken chicken1 = new Chicken(1, "m", 10);
//		chicken1.move();
		
		Sparrow sparrow1 = new Sparrow (2, "F", 5);
//		sparrow1.fly();
//		sparrow1.move();
		
		Fish fish1 = new Fish(2, "F", 3);
		
		moveAnimal(bird1);
		moveAnimal(sparrow1);
		moveAnimal(bird2);
		moveAnimal(fish1);
		
		/**
		 * You can create instances for Interfaces because inside there is a method.
		 */
		
		Flyable flyingSparrow = new Sparrow(1, "F", 10);
		flyingSparrow.fly();
		
		/**
		 * Flyable flyingBird = new Bird(2, "M", 10); This will not works because Sparrow has the flyable method
		 * implemented by Interface but Bird class doesn't.
		 */
		
	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
