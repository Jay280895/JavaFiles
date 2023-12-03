package inheritance_LearnVern;

public class Constructor_Inheritance
{
	public static void main(String [] args)
	{
		//For Default Constructor Demo
		
		Child ch = new Child();
		ch.printname();
		
		GrandChild gc = new GrandChild();
		gc.printGname();
	}
	
}

class Parent
{
	protected String fathername;
	public Parent()
	{
		System.out.println("Parent Class Constructor Called");
		fathername = "Irshad";
	}
	public void printfathername()
	{
		System.out.println(fathername);
	}
	
	
}

class Child extends Parent
{
	String name;
	public Child() 
	{
		System.out.println("Child Class Constructor Called");
		name = "Zaid";
	}
	public void printname() 
	{
		System.out.println(fathername);
		System.out.println(name);
	}
	
}
class GrandChild extends Child{
	String Gname;
	public GrandChild() {
		System.out.println("Grand Child Class Constructor called");
		Gname = "Musa";
	}
	public void printGname() {
		System.out.println(fathername);
		System.out.println(name);
		System.out.println(Gname);
	}
}






