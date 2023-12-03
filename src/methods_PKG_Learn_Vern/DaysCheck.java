package methods_PKG_Learn_Vern;

import java.util.Scanner;

public class DaysCheck {
	@SuppressWarnings("resource")
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Present Day :");
		String day = scanner.nextLine();
		
		System.out.print("Enter Your Count Of Day :");
		int n = scanner.nextInt();
		
		for(int i=0; i<=n; i++) {
			if (n/7 == 0) {
				System.out.println(day);
			}
			else {
				if (n/7 != 0) {
					switch (n) {
					case 1:
						System.out.println("Tuseday");
						break;
					case 2:
						System.out.println("Wednesday");
						break;
					case 3:
						System.out.println("Thursday");
						break;
					case 4:
						System.out.println("Friday");
						break;
					case 5:
						System.out.println("Saturday");
						break;
					case 6:
						System.out.println("Sunday");
						break;
					default:
						System.out.println("Invalid..!"+i);
						break;
					}
				}
			}
		}
	}

}
