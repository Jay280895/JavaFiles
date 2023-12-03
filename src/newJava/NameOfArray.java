package newJava;

import java.util.Scanner;

public class NameOfArray {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		int n, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length of Words In Number of Names Array :-  ");
		n = sc.nextInt();
		sc.nextLine();
		
		String name[] = new String[n];
		
		
		for(i=0; i<name.length; i++) {
			System.out.print("Enter The Name of King "+(i+1)+": ");
			name[i] = sc.nextLine();
		}
		
		
		
		System.out.println("\n");   //For Extra Next Line
		
		
		
		System.out.println("The Full Name is in the Array :-");
		for(i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		
		
		
		System.out.println("\n");  //For Extra Next Line
		
		
		
		
		
		System.out.print("Enter the Name if you want to Find that location of Array:- ");
		String FindName = sc.nextLine();
		int indexOfName = -1;
		for(i=0; i<name.length; i++) {
			if(name[i].equals(FindName)) {
				indexOfName = i;
			}
			//System.out.println(indexOfName);
			
		}
		if (indexOfName == indexOfName) {
            System.out.println("The "+ FindName + " Name was found at Location in the Array is :- "+indexOfName);
        }
	}

}
