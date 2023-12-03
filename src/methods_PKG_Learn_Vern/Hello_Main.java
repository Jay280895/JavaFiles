package methods_PKG_Learn_Vern;

import java.util.Scanner;

public class Hello_Main
{
	public class Hello_Sub
	{
//		public static void main(String [] args)
//		{
//		    System.out.println("Hello Says in the Muslims culture  >-> Asslam-o-Aaleikum...!");
//		    System.out.println("if today is Monday and i will find the day of the week after 84 days  then i will do the (84/7)");
//		}

		public void main()
		{
			System.out.println("Hello Says in the Hinduism culture >-> Namaste.....!");
		}    

	}

	@SuppressWarnings("static-access")
	public static void main(String [] args)
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n Number(and n is n/4) :");
		int n = scanner.nextInt();
		for(int i=1; i<=n/4; i++)
		{
		   System.out.println(i+"."+"Hello My World...!");
		
		}
		
		   Hello_Main hello_Main = new Hello_Main();
		   Hello_Sub Zaid = hello_Main.new Hello_Sub();
//		   Zaid.main(args);
		   Zaid.main();
		   
	}

}
