package methods_PKG_Learn_Vern;

public class Generic
{
	@SuppressWarnings("static-access")
	public static void main(int A , int B)
	
	{
//		@SuppressWarnings("resource")
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter Your Number A : ");
//		int A = scanner.nextInt();
//		
//		System.out.print("Enter Your Number B : ");
//		int B = scanner.nextInt();
		
		Add call = new Add();    //call class  
		
		
		
		int sum = call.Sum(A , B);
		call.Sum(A , B);
		System.out.println("\nAddition of A & B : "+sum);
		
		
		
		int Div = call.Div(A , B);
		call.Div(A , B);
		System.out.println("Division of A & B : "+Div);
		
		
		
		int Multi = call.Multi(A , B);
		call.Multi(A , B);
		System.out.println("\nMultipication of A & B : "+Multi);
		
		
		
		int Sub = call.Sub(A , B);
		call.Sub(A , B);
		System.out.println("Subtractions of A & B : "+Sub);
		
	}
}
