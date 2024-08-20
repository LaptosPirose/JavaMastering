package Prequisite_OOP;

public class Human {
	private String name;
	private int age;
	private int heightInInches;
	private String eyeColor;

	public Human(String name, int age, int heightInInches, String eyeColor) {
		/*
		 * Constructor for Human Class
		 */
		
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}
	
	public void speak() {
		/*
		 * Speak method.
		 * A method that represents a behavior that almost all humans have.
		 */
		System.out.println(String.format("Hello, my name is %s, and my eyes are %s.", this.name, this.eyeColor));
		System.out.println(String.format("Well, I am %d inches tall.", this.heightInInches));
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void work() {
		System.out.println("working...");
	}
	
	/*
	 * Getters and Setters
	 */
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the heightInInches
	 */
	public int getHeightInInches() {
		return heightInInches;
	}

	/**
	 * @param heightInInches the heightInInches to set
	 */
	public void setHeightInInches(int heightInInches) {
		this.heightInInches = heightInInches;
	}

	/**
	 * @return the eyeColor
	 */
	public String getEyeColor() {
		return eyeColor;
	}

	/**
	 * @param eyeColor the eyeColor to set
	 */
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

}
