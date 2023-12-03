package newJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class PNB
{
	private String Name    = "Mohd Jaid";
	
	private String Father  = "Irshad Ali";
	private String Account = "KKBK004608";
	private String Mobile  = "931295436";
	private String Adderese= "Loni Ghaziabad";
	private String Branch  = "Yamuna Vihar";
	private double balance = 10000;
	private int password;
	
	
	
	@SuppressWarnings("resource")
	public void AccountDetails() throws IOException
	{
		
		System.out.println("Enter Your Password :- ");
		try {
		 File myObj = new File("C:\\Users\\jay.p3\\Desktop\\"+Name);
	        if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
			FileWriter fileWriter = new FileWriter("C:\\Users\\jay.p3\\Desktop\\"+Name);
			
			fileWriter.write(Name    + "\n");
			fileWriter.write(Father  + "\n");
			fileWriter.write(Account + "\n");
			fileWriter.write(Mobile  + "\n");
			fileWriter.write(Adderese+ "\n");
			fileWriter.write(Branch  + "\n");
			fileWriter.write(balance + "\n");
			fileWriter.close();
			//scanner.close();
			
			System.out.println("Text Saved to 'C:\\Users\\jay.p3\\Desktop\\'"+Name);
		}
		catch (IOException i) {
			System.out.println(i);
		} 
			//write the user input to the file
			
			
		
  		
		Scanner sc = new Scanner(System.in);
		password = sc.nextInt();
		
		if(password == 123) 
		{
			
			System.out.println("Name :- "+Name);
			System.out.println("Father Name :- "+Father);
			System.out.println("Account No.:- "+Account);
			System.out.println("Mobile No. :- "+Mobile);
			System.out.println("Bank Adderese :- "+Adderese);
			System.out.println("Branch Name :- "+Branch);
			System.out.println("Bank Account Balance:- "+balance);	
		}
		else 
		{
			System.out.println("Incorrect Password...! Try Again..!");
		}
	}
	
	@SuppressWarnings("resource")
	public void Deposite(Double money) 
	{
		
		System.out.println("Enter Your Password:- ");
		Scanner sc = new Scanner(System.in);
		password = sc.nextInt();
		
		if(password == 123) 
		{
			balance = balance + money;
			System.out.println("Deposite Money :- "+money);
			System.out.println("Total Balance :- "+balance);
		}
		else 
		{
			System.out.println("Incorrect Password...! Try Again..!");
		}
		
	}
	
	@SuppressWarnings("resource")
	public void Withdraw(Double money) 
	{
		System.out.println("Enter Your Password:- ");
		Scanner sc = new Scanner(System.in);
		password = sc.nextInt();
		if(password == 123) 
		{
			balance = balance-money;
			System.out.println("Withdraw Money:- "+money);
			System.out.println("Total Balance :- "+balance);
		}
		else 
		{
			System.out.println("Incorrect Password...! Try Again..!");

		}

	}
	@SuppressWarnings("resource")
	public void CheckBalance() 
	{
		System.out.println("Enter Your Password:- ");
		Scanner sc = new Scanner(System.in);
		password = sc.nextInt();
		if(password == 123) 
		{
			System.out.println("Total Balance :- "+balance);
		}
		else 
		{
			System.out.println("Incorrect Password...! Try Again..!");

		}
	}
	
	
}
public class AA
{
	@SuppressWarnings("resource")
	public static void main(String [] agrs) throws IOException 
	{
		
		PNB KB = new PNB();
		
		int info;
		
		System.out.println("1. Account Details :-");
		System.out.println("2. Deposite Money  :-");
		System.out.println("3. Withdraw Money  :-");
		System.out.println("4. Check Balance   :-");
		System.out.println("5. Exit Account    :-");
		
		System.out.println("\nEnter Your Choice :- ");
		
		
		

		do {
			Scanner scanner = new Scanner(System.in);
			info = scanner.nextInt();
			switch (info)
			{
			case 1 : KB.AccountDetails();
			break;
			
			case 2 : KB.Deposite((double) 999);
			break;
			
			case 3 : KB.Withdraw((double) 100);
			break;
			
			case 4 : KB.CheckBalance();
			break;
			
			case 5:  
                System.out.println("See you soon...");  
                break;
			
			default : System.out.println("Invalid Choice..!");
			
			}
			
		} while (info!=5);
		
		
	}

}
