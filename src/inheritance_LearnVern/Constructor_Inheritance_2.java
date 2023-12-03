package inheritance_LearnVern;

public class Constructor_Inheritance_2 {
	//For Parameterized Constructor Demo
	
	public static void main(String [] args)
	{
		System.out.println("Super Class Data:-");
		Super sp = new Super(8);
		sp.printSuper();
		
		
		
		System.out.println("\n\nSub Class Data:-");
		Sub sb = new Sub(12, 42);
		sb.printIJ();
		
		
		
		System.out.println("\n\nSuperSub Class Data:-");
		SuperSub ss  = new SuperSub(10,20,30);
		ss.printIJ();
		
	}

}


class Super
{
	final protected int i;
	
//	public Super()//Default Constructor For Super Class 
//	{
//		System.out.println("Super Class Default Constructor Called");
//		i = 15;
//	}
	
	
	public Super(int i)//Parameterized Constructor For Super Class 
	{
		System.out.println("Super Class Parameterized Constructor Called");
		this.i = i;
	}
	
	
	public void printSuper()
	{
		System.out.println("I : "+i);
	}
	
}

class Sub extends Super
{
	protected int j;
	
	public Sub(int i, int j)//Parameterized Constructor For Sub Class
	{
		
		super(i);//Call Super Class Parameterized Constructor
		
		
		System.out.println("Sub Class Parameterized Constructor Called");
		this.j = j;
	}
	
	public void printIJ()
	{
		System.out.println("I : "+i);
		System.out.println("J : "+j);
	}
}

class SuperSub extends Sub
{
	int k;
	
	public SuperSub(int i, int j, int k)//Parameterized Constructor For SuperSub Class 
	{
		super(i, j);//Call Sub Class Parameterized Constructor
		
		System.out.println("SuperSub Class Parameterized Constructor Called");
		this.k = k;
	}
	
	public void printIJ()
	{
		System.out.println("I : "+i);
		System.out.println("J : "+this.j);
		System.out.println("K : "+this.k);
	}
}








