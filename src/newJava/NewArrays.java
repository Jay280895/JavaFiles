package newJava;

import java.util.Scanner;

public class NewArrays {

	public static void main(String [] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Number:-");
		
		int n = scanner.nextInt();
		
		int[] number = new int[n];  
		 System.out.println("Enter the Numbers of the array :- ");  
		for(int i=0; i<n; i++) {
			System.out.print("Enter The Number "+(i+1)+" :- ");
			number[i]=scanner.nextInt(); 
		}
		
		
		System.out.println("Array Numbers locations are :- ");
		
		
		for (int i=0; i<n; i++)   
		{  
		System.out.println(i + ". -> " + number[i]);  
		}  
	}
}
