package packages_LearnVern;

import java.util.Scanner;

class Class_in_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Class_in_Class s = new Class_in_Class();

		System.out.println("Enter the Value of Cos : ");
		int CosValue = sc.nextInt();
		Class_in_Class.Cos c = s.new Cos(CosValue);
		c.printCos();

		System.out.println("Enter the Value of Cot : ");
		int CotValue = sc.nextInt();
		Class_in_Class.Cos.Cot ct = c.new Cot(CotValue);
		ct.printCot();

	}

	// Class Cos in the Class Class_in_Class
	class Cos {
		int CosValue;

		public Cos(int CosValue) { // Constructor
			this.CosValue = CosValue;
		}

		public void printCos() {
			System.out.println("Value of Cos : " + this.CosValue);
		}

		// Class Cot in the Class Cos
		class Cot {
			int CotValue;

			public Cot(int CotValue) { // Constructor
				this.CotValue = CotValue;
			}

			public void printCot() {
				System.out.println("Value of Cot : " + this.CotValue);
			}
		}
	}

}
