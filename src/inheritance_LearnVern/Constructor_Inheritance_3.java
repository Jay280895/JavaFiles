package inheritance_LearnVern;

public class Constructor_Inheritance_3 
{
	@SuppressWarnings("unused")
	public static void main(String [] args)
	{
	
		{
			C obj_c = new C(12);
		}
	}

}
class A
{
	A(int i)
	{
		i = 34;
		System.out.println("A Constructor");
		System.out.println(i);
	}
	
}

class B extends A 
{
	B(int j)
	{
		super(j);
		j = 9;
		System.out.println("B Constructor");
		System.out.println(j);
	}
}

class C extends B
{
	C(int k)
	{
		super(k);
		k = 45;
		System.out.println("C Constructor");
		System.out.println(k);
	}
	
}
