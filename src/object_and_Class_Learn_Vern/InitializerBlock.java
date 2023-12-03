package object_and_Class_Learn_Vern;

public class InitializerBlock {
	public InitializerBlock() //Constructor 
	{
		System.out.println("This is Constructor");
	}
	
	//Initializer Block
	{
		System.out.println(" \t\t Initializer Block ");
	}
	//1
	{
		System.out.println("Initializer Block 1");
	}
	
	//2
	{
		System.out.println("Initializer Block 2");
	}
	
	//3
	{
		int i =4, j = i+1;
		
		System.out.print("Initializer Block 3");
		System.out.println(" :\t The Sum of i & j "+(i+j));
	}
	 
	//4
	{
		System.out.println("Initializer Block 4");
	}
	 
	//5
	{
		System.out.println("Initializer Block 5");
	}
	
	
	// Static Initializer Block
	static 
	{
		System.out.println(" \t\t Static Initializer Block ");
	}
	static 
	{
		System.out.println("Initializer Block 1");
	}
	static 
	{
		System.out.println("Initializer Block 2");
	}
	static
	{
		int i =4, j = i+1;
		
		System.out.print("Initializer Block 3");
		System.out.println(" :\t The Sum of i & j "+(i+j));
	}
	static 
	{
		System.out.println("Initializer Block 4");
	}
	static 
	{
		System.out.println("Initializer Block 5");
	}
	
	@SuppressWarnings("unused")
	public static void main(String [] args){
		System.out.println("Started Code ");
		InitializerBlock object = new InitializerBlock();
		System.out.println("End of the Code ");
		
	}

}
