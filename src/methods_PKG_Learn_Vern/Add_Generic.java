package methods_PKG_Learn_Vern;

import java.util.Scanner;

public class Add_Generic {
	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Number A : ");
		int A = scanner.nextInt();
		
		System.out.print("Enter Your Number B : ");
		int B = scanner.nextInt();
		
		Generic Add2Gen = new Generic();
		Add2Gen.main(A,B);
	}

}
