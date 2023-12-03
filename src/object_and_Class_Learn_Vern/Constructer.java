package object_and_Class_Learn_Vern;

public class Constructer
{
	public static void main(String [] args)
	{
		Zaid mj = new Zaid(); //call of default Constructor 
		Zaid mj1 = new Zaid("Mohd Zaid Sheikh ",20); //call of Parameterized constructor
		
		mj.displayZaid(); //call the display print method for Default Constructor 
		//^ But This is Overloading Of Constructor 
		//|  Because if constructor is more then they called Overloading Of Constructor 
		
		
		mj1.displayZaid(); //call the display print method for Parameterized Constructor
		
//		System.out.println("color2 & curl ascii.live/forrest");
//		System.out.println("https://www.learnvern.com/r1/828203");
	}

}
class Zaid
{
	private String FName;
	private int Age;
	
	Zaid() //Default Constructor
	{
		FName = "Khan Sheikh";
		Age   = 25;
	}
	public Zaid(String FName, int Age)  //Parameterized Constructor
	{
		this.FName = FName;
		this.Age = Age;
	}
	

	public void displayZaid()
	{
		System.out.println("The Name of Zaid "+FName +" The Age of Zaid "+Age);             //Print method for Default constructor
		System.out.println("The Name of Zaid "+this.FName +" The Age of Zaid "+this.Age);   //Print method for Parameterized constructor
	}
}
