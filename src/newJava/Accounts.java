package newJava;

import java.util.Scanner;
import java.io.*;

public class Accounts {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args)throws Exception {
Scanner detail = new Scanner(System.in);
		
		                     //My Details.....
		
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
		
		
		
		
		                   //File Accses....
		
		
		
		// File path is passed as parameter
        File file = new File("C:\\Users\\jay.p3\\Desktop\\Account.txt");
 
        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)
 
        // Creating an object of BufferedReader class
        BufferedReader in = new BufferedReader(new FileReader(file));
        
        BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\jay.p3\\Desktop\\Account.txt"));
        try {
            String inputLine = null;
            do {
                inputLine=in.readLine();
                out.write(inputLine);
                out.newLine();
            } while (!inputLine.equalsIgnoreCase("eof"));
            System.out.print("Write Successful");
        } catch(IOException e1) {
            System.out.println("Error during reading/writing");
        } finally {
            out.close();
            in.close();
        }
        
        
        
        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = in.readLine()) != null)
 
            // Print the string
            System.out.println(st);
	}

}
