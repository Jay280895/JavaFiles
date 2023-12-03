package Abstraction_LearnVern;

import java.util.Scanner;

public class Interface_Example implements FlyingObject {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice 1 is Aeroplane & 2 is SpaceShip & 3 is Car...");
		int choice = sc.nextInt();
		Vehicle vc;
		if (choice == 1) {
			System.out.println("Enter the Aeroplane Details..!");

			System.out.print("Enter Aeroplane Maximum Speed (only integer): ");
			int MaxSpeed = sc.nextInt();

			System.out.print("Enter Aeroplane Numbers of Seats (only integer): ");
			int NoSeats = sc.nextInt();

			System.out.print("Enter Aeroplane Type of Fuel : ");
			String Fuel = sc.next();

			System.out.print("Enter Aeroplane Brand : ");
			String Brand = sc.next();

			System.out.print("Enter Aeroplane Take off Speed (only integer): ");
			int TakeOfSpeed = sc.nextInt();

			System.out.print("Enter Aeroplane Numbers of Pilot (only integer): ");
			int NoOfPilot = sc.nextInt();

			vc = new Aeroplane(MaxSpeed, NoSeats, Fuel, Brand, TakeOfSpeed, NoOfPilot);
			System.out.println(vc.toString());

//			vc.toString();
//			MaxSpeed = sc.nextInt();
//			NoSeats = sc.nextInt();
//			Fuel = sc.nextLine();
//			Brand = sc.nextLine();
//			TakeOfSpeed = sc.nextInt();
//			NoOfPilot = sc.nextInt();

		} else if (choice == 2) {
			System.out.println("Enter the SpaceShip Details..!");

			System.out.print("Enter SpaceShip Maximum Speed (only integer): ");
			int MaxSpeed = sc.nextInt();

			System.out.print("Enter SpaceShip Numbers of Seats (only integer): ");
			int NoSeats = sc.nextInt();

			System.out.print("Enter SpaceShip Type of Fuel : ");
			String Fuel = sc.next();

			System.out.print("Enter SpaceShip Company : ");
			String Brand = sc.next();

			System.out.print("Enter The SpaceShip is ultra voilate rays proof (only Yes/No) : ");
			String ultraVoilate = sc.next();

			vc = new SpaceShip(MaxSpeed, NoSeats, Fuel, Brand, ultraVoilate);
			System.out.println(vc.toString());

		} else if (choice == 3) {
			System.out.println("Enter the Car Details..!");

			System.out.print("Enter Car Maximum Speed (only integer): ");
			int MaxSpeed = sc.nextInt();

			System.out.print("Enter Car Numbers of Seats (only integer): ");
			int NoSeats = sc.nextInt();

			System.out.print("Enter Car Type of Fuel : ");
			String Fuel = sc.next();

			System.out.print("Enter Car Brand : ");
			String Brand = sc.next();

			System.out.print("Enter the Car is SunRoof (only Boolean) : ");
			boolean SunRoof = sc.nextBoolean();

			vc = new Car(MaxSpeed, NoSeats, Fuel, Brand, SunRoof);
			System.out.println(vc.toString());

		} else {
			System.err.println("Invalid Choice...!");
		}

//		if( instanceof FlyingObject) {
//			System.out.println("This is Flying Object...");
//		}
	}

}

class Vehicle {
	int MaxSpeed;
	int NoSeats;
	String Fuel;
	String Brand;

	public Vehicle(int MaxSpeed, int NoSeats, String Fuel, String Brand) {

		this.MaxSpeed = MaxSpeed;
		this.NoSeats = NoSeats;
		this.Fuel = Fuel;
		this.Brand = Brand;
	}

	@Override
	public String toString() {
		String printVehicle;
		printVehicle = "Maximum Speed : " + MaxSpeed + " per hour" + "\nNumbers of Seats : " + NoSeats
				+ "\nType Of Fuel : " + Fuel + "\nThe Brand Company : " + Brand;
		return printVehicle;
	}
}

interface FlyingObject {
	int MaxHeight = 30000;
}

class Aeroplane extends Vehicle implements FlyingObject {
	int TakeOfSpeed;
	int NoOfPilot;

	public Aeroplane(int MaxSpeed, int NoSeats, String Fuel, String Brand, int TakeOfSpeed, int NoOfPilot) {
		super(MaxSpeed, NoSeats, Fuel, Brand);
		this.TakeOfSpeed = TakeOfSpeed;
		this.NoOfPilot = NoOfPilot;
	}

	@Override
	public String toString() {
		String PrintAero;
		PrintAero = "Attribute of Aeroplane...\n";
		PrintAero = PrintAero + "Maximum Speed : " + MaxSpeed + " Km per hour" + "\nNumbers of Seats : " + NoSeats
				+ "\nType Of Fuel : " + Fuel + "\nThe Brand Company : " + Brand;
		PrintAero = PrintAero + "\nThe Take Of Speed : " + TakeOfSpeed + " Km per hour" + "\nNumbers Of Pilot : "
				+ NoOfPilot;
		return PrintAero;
	}

}

class SpaceShip extends Vehicle implements FlyingObject {
	String ultraVoilate;

	public SpaceShip(int MaxSpeed, int NoSeats, String Fuel, String Brand, String ultraVoilate) {
		super(MaxSpeed, NoSeats, Fuel, Brand);
		this.ultraVoilate = ultraVoilate;
	}

	@Override
	public String toString() {
		String printSpaceShip;
		printSpaceShip = "Attributes of SpaceShip...\n";
		printSpaceShip = printSpaceShip + "Maximum Speed : " + MaxSpeed + "\nNumbers of Seats : " + NoSeats
				+ "\nType Of Fuel : " + Fuel + "\nThe Brand Company : " + Brand;
		printSpaceShip = printSpaceShip + "\nThe SpaceShip is ultra voilate rays proof : " + ultraVoilate;
		return printSpaceShip;
	}

}

class Car extends Vehicle {
	boolean SunRoof;

	public Car(int MaxSpeed, int NoSeats, String Fuel, String Brand, boolean SunRoof) {
		super(MaxSpeed, NoSeats, Fuel, Brand);
		this.SunRoof = SunRoof;
		if (SunRoof == true) {
			System.out.println("Yes");
		} else {
			System.err.println("Noo");
			System.out.println("Car.Car()");
		}
	}

	@Override
	public String toString() {
		String printCar;
		printCar = "Attributes of Car...\n";
		printCar = printCar + "Maximum Speed : " + MaxSpeed + "\nNumbers of Seats : " + NoSeats + "\nType Of Fuel : "
				+ Fuel + "\nThe Brand Company : " + Brand;
		printCar = printCar + "\nThe Car is SunRoof : " + SunRoof;
		return printCar;
	}
}
