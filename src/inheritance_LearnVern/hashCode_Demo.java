package inheritance_LearnVern;

public class hashCode_Demo
{
	public static void main(String [] args)
	{
		student s = new student(18,"Mohd Zaid");
		//System.out.println(s);
		s.print(); //For Print Method 
		System.out.println(s+"\n");
		
		String xyz = String.valueOf(s.hashCode());
		System.out.println("Hash Code in numb : "+xyz);
		
	}

}
class student
{
	int rollNo;
	String name;
	
	public student(int rollNo, String name)
	{
		this.rollNo  = rollNo;
		this.name = name;
	}
	
	public void print()
	{
		System.out.println("The Name : "+name+"\nRoll No : "+rollNo);
	}
	public String toString() {
		System.out.println("\nFor To String Method - ");
		String Let = "Name : "+name+"\nRoll No :"+rollNo;
		return Let;
		
	}
}
