package Abstraction_LearnVern;

import java.util.Scanner;

public class Abstract_First_Demo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice : \nNo. 1 is Cat : \nNo. 2 is Dog : \nNo. 3 is Cow :");
		int choice = sc.nextInt();

		Animal a;
		switch (choice) {
		case 1:
			System.out.println("The Cat Color & Sound is...");
			a = new Cat("White Color");
			a.AniSound();
			break;

		case 2:
			System.out.println("The Dog Color & Sound is...");
			a = new Dog("Black Color");
			a.AniSound();
			break;

		case 3:
			System.out.println("The Cow Color & Sound is...");
			a = new Cow("Brown Color");
			a.AniSound();
			break;

		default:
			System.err.println("Invalid Choice....!");
			break;
		}

//		if (choice == 1) {
//			a = new Cat("White Color");
//			System.out.println("The Cat Sound is...");
//			a.AniSound();
//		} else if (choice == 2) {
//			System.out.println("The Dog Sound is...");
//			a = new Dog("Black Color");
//			a.AniSound();
//		} else if (choice == 3) {
//			System.out.println("The Cow Sound is...");
//			a = new Cow("Brown Color");
//			a.AniSound();
//		} else {
//			System.err.println("Invalid Choice....!");
//		}
	}
}

//Abstract Base Class
abstract class Animal {
	String color;

	abstract public void AniSound();

	public Animal(String color) {
		this.color = color;
	}

	public void printColor() {
		System.out.println("The Color is : " + this.color);
	}
}

//Derived Class Inherit by Animal
class Cat extends Animal {
	public Cat(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AniSound() {
		super.printColor();
		System.out.println("The Voice is : " + "Meaow... Meaow...");
	}
}

//Derived Class Inherit by Animal
class Dog extends Animal {
	public Dog(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AniSound() {
		super.printColor();
		System.out.println("The Voice is : " + "Baow... Baow...");
	}
}

//Derived Class Inherit by Animal
class Cow extends Animal {
	public Cow(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AniSound() {
		super.printColor();
		System.out.println("The Voice is : " + "Mmmmaa... Mmmmaa...");
	}

}
