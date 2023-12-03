package inheritance_LearnVern;

public class Equal_Method {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		System.out.println("The Values of Triangle : ");
		Triangle tr = new Triangle(8, 6, 9);
		System.out.println(tr);

		System.out.println("\nThe Values of Pentagonal : ");
		Pentagonal pg = new Pentagonal(7, 9, 6, 4, 8);
		System.out.println(pg);

		String s = new String("$$$");
		System.out.println(s);
		Long l = new Long(634);
		System.out.println(l);

	}

}

class Triangle {
	int i, j, k;

	public Triangle(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}

	@Override
	public String toString() {
		String sides = "I : " + i + "\nJ : " + j + "\nK : " + k;
		return sides;
	}
}

class Pentagonal extends Triangle {
	int l;
	int m;

	public Pentagonal(int i, int j, int k, int l, int m) {
		super(i, j, k);
		this.l = l;
		this.m = m;
	}

	@Override
	public String toString() {
		String abc = super.toString();
		// String sides = "I : "+i+"\nJ : "+j+"\nK : "+k+
		String xyz = "\nL : " + l + "\nM : " + m;
		return abc + xyz;

	}

}
