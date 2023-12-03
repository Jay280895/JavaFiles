package methods_PKG_Learn_Vern;

public class Recursive_Finite_Method {
	
	static int count = 0;
	public static void main(String [] Args) {
		p_finite();
	}
	static void p_finite() {
		count++;
		if (count <= 50) {
			System.out.println("Hello : "+count);
			p_finite();
		}
		//p_finite();
	}

}
