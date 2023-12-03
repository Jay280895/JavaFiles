package Abstraction_LearnVern;

interface Frosty {

	public static void main(String[] args) {
		System.out.println("Hello");
		PK fr = new PK();
		fr.mau();
		fr.main();

	}

	void mau();
}

class PK implements Frosty {
	@Override
	public void mau() {
		int a = 54;
		int b = 48;
		int add;
		add = a + b;
		System.out.println("Total Add " + add);
	}

	public void main() {
		System.out.println("Help");
	}

}
