package newJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bank {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		try {
			//Create a FileWriter and specify the file name
			
			
			//Create a scanner to get user input
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Some text About yours(type 'exit' to finish and save):- ");
			
			
			
			while(true) {
				String input = scanner.nextLine();
				
				if(input.equalsIgnoreCase("exit")) {
					break;
				}
				
				
				
				                        //My Details
				
				
				
				String Name;
				System.out.println("Enter Your Name :- ");
				Name = scanner.nextLine();
				
				String AccountNumber;
				System.out.println("Enter Your Account No :- ");
				AccountNumber = scanner.nextLine();
				
				String AadhaarNumber;
				System.out.println("Enter Your Aadhaar No :- ");
				AadhaarNumber = scanner.nextLine();
				File myObj = new File("C:\\Users\\jay.p3\\Desktop\\"+AadhaarNumber);
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
				FileWriter fileWriter = new FileWriter("C:\\Users\\jay.p3\\Desktop\\"+AadhaarNumber);
				
				String MobileNumber;
				System.out.println("Enter Your Mobile No :- ");
				MobileNumber = scanner.nextLine();
				
				
				
				//write the user input to the file
				
				fileWriter.write(input+"\n");
				fileWriter.write(Name+"\n");
				fileWriter.write(AccountNumber+"\n");
				fileWriter.write(AadhaarNumber+"\n");
				fileWriter.write(MobileNumber+"\n");
				fileWriter.close();
				//scanner.close();
				
				System.out.println("Text Saved to 'C:\\Users\\jay.p3\\Desktop\\'"+AadhaarNumber);
				
				
			}
			
			//close the FileWriter to save the file 
			
			
		}
		catch (IOException e) {
			System.out.println("An error occured :- "+ e.getMessage());
		}
	}

}
