package classes;

import java.util.Scanner;

public class Leap
{
	@SuppressWarnings({ "resource", "unused" })
	public static void main (String args[])
	{
		         //Questions Class
		questions bonus_Checker= new questions();
		bonus_Checker.bonus_Checker();
		Scanner input_Scan=new Scanner(System.in);
		
		
		         //LeapYearCheck Class
		System.out.println("Enter the Year to check Leap Year ");
		int Year = input_Scan.nextInt();
		leapYearCheck yearCheck=new leapYearCheck();
		yearCheck.yearCheck(Year);
		
		
		
		         //SquareCheck Class
		squareCheck squareCheck1=new squareCheck();
		squareCheck1.squareChecking(args);
		
		
		
		          //AttendenceCheck Class
		System.out.println(" Enter the no of classes held ");
		int classHeld = input_Scan.nextInt();
		System.out.println("Enter the number of classes attended ");
		int attendedDays=input_Scan.nextInt();
		System.out.println("Was there any medical issue with you answer in Y/N ");
		char medicalStatus= input_Scan.next().charAt(0); ;
		attendenceCheck attendenceCheck=new attendenceCheck();
		attendenceCheck.attendenceChecking(classHeld, attendedDays,medicalStatus );
		
		
		
		
		
		         //JobAllocation Class
		System.out.println ("Enter you Gender please as M/F ");
		char gender=input_Scan.next ().charAt ( 0 );
		System.out.println ("Enter you Martial Status Y/N ");
		char maritalStatus=input_Scan.next ().charAt ( 0 );
		System.out.println ("Enter you age ");
		int age=input_Scan.nextInt ();
		jobAllocation jobAllocation=new jobAllocation ();
		jobAllocation.job_Allocation( gender, age,maritalStatus );
		
		
		
		
		
		            //NumberReverse Class
		System.out.println ("Enter the Number to reverse only 4 Digit allowed");
		int Number=input_Scan.nextInt ();
		numberReverse reverse=new numberReverse ();
		reverse.number_Reverse (  Number);
		int x = 2;
		int y = 5;
		int z = 0;
		System.out.println(x==2);
		System.out.println(x != 5);
		System.out.println(x != 5 && y >= 5);
		System.out.println(z != 0 || x == 2);
		System.out.println(!(y < 10));
		
		
		byte j=127;
		char jpn=1971;
		char k='\u0061';
		double jp=123.456;
		int x1=10;
		int y1= 010;
		int z1= 0x10;
		System.out.println(x1+" "+y1+" "+z1+" "+jpn+k);
		System.out.print ("Enter the number to reverse");
		int reverseNum=input_Scan.nextInt ();
		numberReverse numberReverse=new numberReverse ();
		numberReverse.number_Reverse ( reverseNum );
		System.out.println (1%10);
		
	}
}
