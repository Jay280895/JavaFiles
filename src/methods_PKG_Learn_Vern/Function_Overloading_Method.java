package methods_PKG_Learn_Vern;

import java.util.Scanner;

import java.lang.Math;

public class Function_Overloading_Method {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Circle Radius value for user input
		System.out.print("Enter Your Radius for circle :->");
		int radius = scanner.nextInt();
		
		//Rectangle length & width value for user input
		System.out.print("\nEnter Your Length rectangle :->");
		int length = scanner.nextInt();
		System.out.print("Enter Your Width for rectangle :->");
		int width  = scanner.nextInt();
		
		//Triangle a,b & c value for user input
		System.out.print("\nEnter Your a value for Triangle :->");
		int a = scanner.nextInt();
		System.out.print("Enter Your b value for Triangle :->");
		int b = scanner.nextInt();
		System.out.print("Enter Your c value for Triangle :->");
		int c = scanner.nextInt();
		
		System.out.println("\n\nOutput & Result is :-> \n>-->");
		System.out.println("The Area Of Circle    is :-> "+area(radius));
		System.out.println("The Area of Rectangle is :-> "+area(length,width));
		System.out.println("The Area Of Triangle  is :-> "+area(a,b,c));
	}
	
	
	//For Circle
	static float area(int radius) 
	{
		float result = (float) (Math.PI * radius * radius);
		return result;
	}
	//For Rectangle
	static float area(int length, int width)
	{
		float result = length * width ;
		return result;
	}
	//For Triangle
	static float area(int a, int b, int c )
	{
		float s = (float)(a + b + c)/2.0f;
		return (float) Math.sqrt (s * (s-a) * (s-b) * (s-c));
		
		//return s = (float) Math.sqrt (s * (s-a) * (s-b) * (s-c));
		//float calculation = (float)Math.sqrt (s * (s-a) * (s-b) * (s-c));
		//return calculation;
	}
	

}
