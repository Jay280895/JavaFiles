package newJava;

import java.util.Scanner;

public class ArrayDemo {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		System.out.println("Enter Your Number:- ");
		
     	Scanner sc = new Scanner(System.in);
     	int n = sc.nextInt();
		
		 int i,sum=0, multi=1;
		
		int Number[] = new int [n];
		System.out.println("Enter Your Arrays :- ");
		
		for(i=0; i<Number.length; i++) 
		{
			Number[i] = sc.nextInt();
		}
		System.out.println("Arrays Number is :- ");

		int Maximum = Number[0];
		int Minimum = Number[0];
		
		for(i=0; i<Number.length; i++) {
			sum = sum + Number[i];
			multi = multi * Number[i];
			System.out.println(Number[i]);
		
			if (Number[i] > Maximum )    //For Maximum Number Of Array
			{
				Maximum = Number[i];
			}
			if (Number[i] < Minimum)     //For Minimum Number Of Array
			{
				Minimum = Number[i];
			}
		}
		
		                          //Finding the location of Max/Min Array
		
		
		int locationMax = 0;
		int locationMin = 0;

		for (i = 0; i < Number.length; i++)
		{
		    if (Number[i] == Maximum)
		    {
		        locationMax = i;
		    }
		    if (Number[i] == Minimum)
		    {
		        locationMin = i;
		    }
		}
		
		System.out.print("\n");
		
		
		System.out.println("The Maximum Number Of Array it is :- "+Maximum);
		System.out.println("The Minimum Number Of Array it is :- "+Minimum);
		System.out.print("\n");
		System.out.println("Location of Maximum Number "+Maximum+" is :- "+locationMax);
		System.out.println("Location of Minimum Number "+Minimum+" is :- "+locationMin);
		System.out.println("\nTotal Addition :- "+sum);
		System.out.println("Total Multipication of Arrays :- "+multi);

		
		
		
		
	}
}
