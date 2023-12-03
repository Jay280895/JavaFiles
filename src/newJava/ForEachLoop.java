package newJava;

public class ForEachLoop {

	public static void main(String[] args) {
		int [] Number = {12,36,45,16,21};
		int sum = 0;
		for(int value : Number ) 
		{
			sum += value;
			System.out.println("Addition "+value+" = "+sum);
		}
		
		
		System.out.println();
		
		
		
		for(int value : Number )
		{
		    sum *= value;
		    System.out.println("Multipication "+value+" = "+sum);
		}
		
		
		
		
        System.out.println();
		
		
        
        
		
		for(int value : Number )
		{
		    sum -= value;
		    System.out.println("Subtraction "+value+" = "+sum);
		}
		
		
		
		
		System.out.println();
		
		
		
		
		
		for(int value : Number )
		{
		    sum /= value;
		    System.out.println("Dividetion "+value+" = "+sum);
		}

	}

}
