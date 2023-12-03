package inheritance_LearnVern;

public class Super_Keyword_Inheritance {
	public static void main(String [] args) {
		Name NM = new Name();
		SubName SN = new SubName();
		SurName SR = new SurName();
		NM.printName();
		System.out.println();
		SN.printSubName();
		System.out.println();
		SR.printSurName();
		
	}

}
class Name
{
	protected String name;
	
	Name() //Constructor
	{
		name = "Mohd";
	}
	
	public void printName()
	{
		System.out.print(name);
	}
	
}


class SubName extends Name
{
	protected String subname;
	
	SubName()  //Constructor
	{
		//super.name = "Mohd";      //call Name class instance variable. OR If our instance variable are protected or public then use this type
		
		//or
		
		super();                  //here super keyword call Name constructor Direct. OR If our instance variable are private then use this type
		
		this.subname = "Zaid";   //This is call Current class SubName Object
	}
	
	public void printSubName()
	{
		super.printName();
		System.out.print("\n"+subname);
	}
}


class SurName extends SubName 
{
	protected String surname;
	
	SurName() //Constructor
	{
		//super.name = "Mohd";       //call Name class instance variable. OR If our instance variable are protected or public then use this type
		//super.subname = "Zaid";   //call Name class instance variable. OR If our instance variable are protected or public then use this type
		
		//or
		
		super();                  //here super keyword call Name constructor Direct. OR If our instance variable are private then use this type
		surname = "Sheikh";      //This is call Current class SubName Object
	}
	
	public void printSurName() 
	{
		super.printSubName();
		System.out.print("\n"+surname);
		
	}
	
}

