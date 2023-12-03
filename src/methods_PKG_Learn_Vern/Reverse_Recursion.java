package methods_PKG_Learn_Vern;

import java.util.Scanner;

public class Reverse_Recursion {
	
	//method for reverse a number  
	public static void reverseNumber(long number)   
	{
		if (number < 10)
		{
			//prints the same number if the number is less than 10
			System.out.println(number);
			return;
		}
		else
		{
			System.out.print(number % 10);
			reverseNumber(number/10);
		}  
	}
	
	public static void main(String args[])  
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that you want to reverse: ");
		long num = sc.nextLong();
		
		
	{  //Progress Method 
		
		for (int i = 0; i <= 100; i++)
		{
            System.out.print("Progress: " + i + "%\r");
            // Perform some task here
            try
            {
            	Thread.sleep((long)10); // Simulate a task that takes time
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Program complete!");
	}
	

        System.out.print("The reverse of the given number is: ");
		//method calling
		reverseNumber(num);  
	}  


}
