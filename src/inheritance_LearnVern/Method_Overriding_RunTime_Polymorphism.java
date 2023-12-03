package inheritance_LearnVern;

import java.util.Scanner;

public class Method_Overriding_RunTime_Polymorphism
{
	
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice : ");
			System.out.println("No. 1 is Batsman :  \nNo. 2 is Bowler :  \nNo. 3 is WicketKeeper : \nNo. 4 is Umpier : ");
			int choice = sc.nextInt();
			//System.out.println(sc);
			
			
			Cricketer ck;
			if(choice == 1)
			{
				ck = new Batsman("India", "Virat Kohli", 45, "534.33", 30, 15, 26 );
				ck.print();
				System.out.println(ck);
			}
			
			else if(choice == 2)
			{
				ck = new Bowler("India", "Bumrah", 38, "463.23", 8 );
				ck.print();
				System.out.println(ck);
			}
			
			else if(choice == 3)
			{
				ck = new WicketKeeper("India", "Lingeshwer", 28, "372.3",6);
				ck.print();
				System.out.println(ck);
			}
			else if(choice == 4)
			{
				ck = new Umpier("Aamerica", "Justin", 28, "372.3", "5% is the winning amount of team player ");
				ck.print();
				System.out.println(ck);
			}
			
			else
			{
				System.out.println("Invalid Choice....!");
				
				System.out.println(sc); //print scanner class sc 
			}
			sc.close();
			
		}

}
class Cricketer 
{ final
	protected String country;
	protected String name;
	protected int age; 
	protected String StrikeRate;
	public Cricketer (String country, String name, int age, String StrikeRate)
	{
		this.country = country;
		this.name = name;
		this.age  = age;
		this.StrikeRate = StrikeRate;
	}
	public void print()
	{
		System.out.println("The Country Name : "+country);
		System.out.println("The Player Name : "+name);
		System.out.println("The Age of Player : "+age);
		System.out.println("The Strike Rate of Player : "+StrikeRate);
	}

}

class Batsman extends Cricketer
{
	int run;
	int sixer;
	int four;
	
	public Batsman(String country, String name, int age, String StrikeRate, int run, int sixer, int four)
	{
		
		super(country, name, age, StrikeRate);
		this.run   = run;
		this.sixer = sixer;
		this.four  = four;
		
	}
	public void print()
	{
		super.print();
		System.out.println("The Single Run by Batsman : "+run);
		System.out.println("The Sixer by Batsman : "+sixer);
		System.out.println("The Four by Batsman : "+four);
	}
	
}

class Bowler extends Cricketer
{
	int wickets;
	
	public Bowler(String country, String name, int age, String StrikeRate, int wickets)
	{
		super(country, name, age, StrikeRate);
		this.wickets = wickets;
		
	}
	
	public void print()
	{
		super.print();
		System.out.println("The Bowler has out the player With Wickets : "+wickets);
	}
	
}

final class WicketKeeper extends Cricketer
{
	int catches;
	
	public WicketKeeper(String country, String name, int age, String StrikeRate, int catches)
	{
		super(country, name, age, StrikeRate);
		this.catches = catches;
		
	}
	
	public void print()
	{
		super.print();
		System.out.println("The WicketKeeper Catches Ball : "+catches);
	}
	
}
class Umpier extends Cricketer
{
	String umpierSalary;

	public Umpier(String country, String name, int age, String StrikeRate, String umpierSalary)
	{
		super(country, name, age, StrikeRate);
		this.umpierSalary = umpierSalary;
	}
	public void print() {
		System.out.println("Enter 1 if player is out...! \nEnter 2 if player is not out...!");
		Scanner sc = new Scanner(System.in);
		int outPlayer = sc.nextInt();

		if(outPlayer == 1)
		{
			System.out.println("Player is Out.....! ");
		}
		else if (outPlayer == 2)
		{
			System.out.println("Player is not Out....!");
		}
		else
		{
			System.out.println("Invalid Choice..!");
		}
		super.print();
		System.out.println("Umpier Salary is : "+umpierSalary);
		sc.close();
	}
	
}










