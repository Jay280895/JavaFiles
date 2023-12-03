package inheritance_LearnVern;

public class Final_Keyword_Inheritance {
	public static void main(String [] args) {
		Figma fm = new Figma();
		fm.print();
		
	}

}
class Sigma
{
	//initializer block < Start >
	{
		System.out.println("HEyy");
	}
	//initializer block < end >

	 void frint(){
		System.out.println("Hello From Sigma frint Method");
	}
}

class Figma extends Sigma
{
	//initializer block < Start >

	{
		System.out.println("Heeyyy 12");
	}
	
	//initializer block < end >

	void print(){
		frint();
		System.out.println("Hello From Figma print Method");
	}
	
	//initializer block < Start >
	{
		System.out.println("Hikdsc");
	}
	//initializer block < end >

	
}
