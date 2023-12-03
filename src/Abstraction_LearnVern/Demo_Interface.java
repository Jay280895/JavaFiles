package Abstraction_LearnVern;

public class Demo_Interface implements A, B {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		A.Me();
		B ob = new Demo_Interface();
		ob.We();

		System.out.println("\nClass Object Calling....\n");
		D obj = new D();
		obj.We();
		obj.Me();
		obj.Say(); // Static Access
		obj.Hey();
		obj.Joker();

	}
}

interface A {
	static void Me() {
		System.out.println("1 Heloo");
	}
}

interface B extends A {
	default void We() {

		System.out.println("2 Hiiii");
	}
}

class C {
	public void Joker() {
		System.out.println("3 The Joker....");
	}
}

class D extends C implements B, A {
	static void Say() {
		System.out.println("4 Say Hello...");
	}

	public void Hey() {
		System.out.println("5 Hey Hows That...");
	}

	public void Me() {

		System.out.println("6 Me Hows ...");
		A.Me();
	}

	@Override
	public void We() {
		System.out.println("7 We That...");
	}

}
