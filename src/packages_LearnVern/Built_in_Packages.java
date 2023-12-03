package packages_LearnVern;

import static java.lang.Math.cbrt;
import static java.lang.Math.sqrt;
import static java.lang.System.err; //Static Import package for system.out.println();
import static java.lang.System.in; //Static Import package for system.out.println();
import static java.lang.System.out; //Static Import package for system.out.println();

//import java.util.Scanner;
//import java.lang.System.*;

public class Built_in_Packages {

	public static void main(String[] args) {
		out.print("Hello User...");
		out.print("Enter Your Name : ");

		java.util.Scanner sc = new java.util.Scanner(in); // Scanner class without scanner import package

//		Scanner sc = new Scanner(in);

		String myName = sc.nextLine();
		out.println("Hello My Name is " + myName);

		Built_in_Packages bp = new Built_in_Packages(); // Create class Object of Built_in_Packages

		out.println("Enter Your No. of I & J : ");

		out.print("Enter No I : ");
		int i = sc.nextInt();

		out.print("Enter No J : ");
		int j = sc.nextInt();

		// int Add = i + j;
		// bp.Dil(i, j, Add);

		bp.Dil(i, j); // call For Dil() method
		bp.printDil(); // call For printDil() method

		StaticImport si = new StaticImport(); // Create class Object of StaticImport
		si.niam(); // call For niam() method
		out.println(si.toDouble()); // call For toDouble() method

		// main(args); //This is use for continuous run program

	}

	int i, j;
	int Add;

	// public void Dil(int i, int j, int Add) {
	public void Dil(int i, int j) {
		this.i = i;
		this.j = j;
		// this.Add = Add;
		Add = i + j;
	}

	public void printDil() {
		// out.println("The Addition of I & J is : " + this.Add);
		out.println("The Addition of I & J is : " + Add);
		err.println("Sorry Code Error...!--" + i + j);
	}

}

class StaticImport {

	public void niam() {
		java.util.Scanner sc = new java.util.Scanner(in);
		out.print("\nEnter your Square Root Value (Data Type of Double) : ");
		double d = sc.nextDouble();
		double squareRootOfNumber = sqrt(d);
		out.println("Answer of Square Root " + d + " is : " + squareRootOfNumber);
	}

	public String toDouble() {
		java.util.Scanner sc = new java.util.Scanner(in);
		out.print("\nEnter your Cube Root Value (Data Type of Double) : ");
		double d = sc.nextDouble();
		double cubeRootOfNumber = cbrt(d);
		return "Answer of Cube Root " + d + " is : " + cubeRootOfNumber;
	}

}