package inheritance_LearnVern;

public class Clone_Method2 implements Cloneable
{
	int length;
	int width;
	public Clone_Method2(int length, int width)
	{
		this.length = length;
		this.width = width;
		
	}
	public String toString() 
	{
		return "Length : "+length+" Width : "+width;
		
	}

	public static void main(String [] args)
	{
		Clone_Method2 r = new Clone_Method2(10, 25);
		try
		{
			Clone_Method2 r2 = (Clone_Method2)r.clone();
			System.out.println("Before Modify the value of length and width in R2 ");
			System.out.println("From R object Reference : -");
			System.out.println(r);
			System.out.println("\nFrom R2 object Reference :- ");
			System.out.println(r2);
			
			r2.length = 20;
			r2.width = 45;
			
			System.out.println("\nAfter Modify the value of length and width in R2 ");
			System.out.println("From R object Reference :- ");
			System.out.println(r);
			System.out.println("\nFrom R2 object Reference :- ");
			System.out.println(r2);
		} 
		catch (CloneNotSupportedException xyz)
		{
			System.out.println(xyz);
		}
		
	}

}

/*class RectangleDemo3 implements Cloneable{
	int length;
	int width;
	public RectangleDemo3(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public String toString() {
		return "Length : "+length+"/nWidth : "+width;
	}
}*/




