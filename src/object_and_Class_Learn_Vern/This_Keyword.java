package object_and_Class_Learn_Vern;

public class This_Keyword {
	int i = 5;
	
	void Example() {
		int i = 9;
		System.out.println("For Instance variable : "+i);
		System.out.println("For Local Variable : "+this.i);
	}
	
	public static void main(String [] args) {
		This_Keyword var= new This_Keyword();
		var.Example();
		System.out.println();
		
		Demo D = new Demo();
		Demo D1 = new Demo(78);
		D.printDemo();
		D1.printDemo();
		
	}

}
class Demo{

	private int i; //this.i is This i 
	
	Demo(){
		this(100); //This 100 is this is i 
	}
	Demo(int i){
		this.i = i;
		
	}
	void printDemo() {
		System.out.println(i); // This i is this.i
	}
	
}
