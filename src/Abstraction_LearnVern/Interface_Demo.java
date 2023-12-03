package Abstraction_LearnVern;

public class Interface_Demo implements Inter, Enter {
	@Override
	public void printInter() {
		System.out.println("The Inter Class & \nCall Print Inter Method : " + "\nSum of a & b is : " + Sum);
	}

	@Override
	public void printInter1(int a, int b, int c) {
//		a = a + 1;
//		b = b + 1;
		int sum = (a + b + c);
		System.out.println("Sum is : " + sum);

		System.out.println("Hello Zaid");
	}

	public static void main(String[] args) {
		Interface_Demo ID = new Interface_Demo();
		ID.printInter();
		ID.printInter1(12, 12);
		ID.printInter1(12, 15, 3);
	}
}

interface Inter {
	int a = 12;
	int b = 24;
	int Sum = a + b;

	public void printInter1(int a, int b, int c);

	public void printInter1(int a, int b);

	void printInter();
}

interface Enter extends Inter {
	@Override
	public default void printInter1(int a, int b) {

//		a = a + 1;
//		b = b + 1;
		int sum = (Inter.a + Inter.b + a + b);
		System.out.println("Sum is : " + sum);

		System.out.println("Hello From Zaid");
	}

}
