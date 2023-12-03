package newJava;

import java.util.Scanner;

public class NestedIfElse 
{
	public static void main(String [] args) 
	{
		System.out.println("Enter Your Marks(Maximum Marks is 100...!) :- ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int marks;
		marks = sc.nextInt();
		
		if(marks < 33)
		{
			System.out.println("Sorry You Are Failed..!");
			
			if(marks == 0) 
			{
				System.out.println("Your Marks Is Zero(0)..!");
			} 
			else if (marks < 10) 
			{
				System.out.println("Very Very Poor Bad...! Your Marks is :- "+marks);
			}
			else if(marks > 10 && marks < 20)
			{
				System.out.println("Very Very Bad...! Your Marks is :- "+marks);
			}
			else if (marks > 20)
			{
				System.out.println("Very Bad...! Your Marks is :- "+marks);
			}
			else 
			{
				System.out.println("Invalid Marks....!");
			}
			
		}
		else
		{
			System.out.println("Wooww Congratulations You Are Passed.....");
			
			if (marks > 94)
			{
				System.out.println("Excellent... Your Grade is A+ & Your Marks is :- "+marks);
			}
			else if (marks > 85) 
			{
				System.out.println("Best Performence... Your Grade is A & Your Marks is :- "+marks);
			}
			else if (marks > 75)
			{
				System.out.println("Very Very Good... Your Grade is B & Your Marks is :- "+marks);
			}
			else if (marks > 65)
			{
				System.out.println("Very Good... Your Grade is C & Your Marks is :- "+marks);
			}
			else if (marks > 55)
			{
				System.out.println("Good... Your Grade is D & Your Marks is :- "+marks);
			}
			else if (marks > 45)
			{
				System.out.println("Not Bad... Your Grade is E & Your Marks is :- "+marks);
			}
			else
			{
				System.out.println("No Grade... Only Pass & Your Marks is :- "+marks);
			}
		}
	}

}
