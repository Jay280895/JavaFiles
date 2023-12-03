package newJava;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Account {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String [] args) throws IOException {
		
		String simple  = "";
		
		                                
		
		                                //My Details
		
		
		
		Scanner detail = new Scanner(System.in);
		
		
		
		String Name;
		System.out.println("Enter Your Name :- ");
		Name = detail.nextLine();
		
		
		
		String AccountNumber;
		System.out.println("Enter Your Account No :- ");
		AccountNumber = detail.nextLine();
		
		

		String AadhaarNumber;
		System.out.println("Enter Your Aadhaar No :- ");
		AadhaarNumber = detail.nextLine();
		
		

		String MobileNumber;
		System.out.println("Enter Your Mobile No :- ");
		MobileNumber = detail.nextLine();
		
	
		
		
		
		
		// Passing the path to the file as a parameter
        FileReader fr = new FileReader(
                "C:\\Users\\jay.p3\\Desktop\\hello.txt");

        // Declaring loop variable
        int i;
        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1) {
            simple = simple + (char) i;
            // Print all the content of a file
            System.out.print((char) i);
        }
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(simple);

//        // reverse StringBuilder input1
//       System.out.println(" Reverse "+ input1.reverse());
		
		
	}

}
