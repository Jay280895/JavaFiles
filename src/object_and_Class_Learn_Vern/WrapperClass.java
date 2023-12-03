package object_and_Class_Learn_Vern;


public class WrapperClass {
	public static void main(String [] args) {
		//AutoBoxing Primitive to Wrapper Class
		
		//for integer type 
		int i=78;
		Integer obj_i = Integer.valueOf(i); //old version wrapper
		System.out.println("Autoboxing Old version wrapper for integer :- "+obj_i);
		
		Integer obj_j = i;   //new version 1.5 autoboxing wrapper 
		System.out.println("Autoboxing New Version wrapper for integer :- "+obj_j);
		
		//for string type Autoboxing
		String Name = "Zaid";
		String obj_name = String.valueOf(Name); //old version wrapper
		System.out.println("Autoboxing old version wrapper for String :- "+obj_name);
		
		String obj_same = Name;
		System.out.println("Autoboxing New version wrapper for String :- "+obj_same);
		
		
	
		
			
		//Unboxing Wrapper Type to Primitive type
		
		@SuppressWarnings("removal")
		
		//for integer
		Integer obj_n = new Integer(67);
		int n = obj_n.intValue();
		System.out.println("Unboxing Old Version wrapper for integer :- "+n);
		
		int m = obj_n;
		System.out.println("Unboxing New Version wrapper for integer :- "+m);
		
//		//for String
//		String obj_St = new String("Mohd");
//		 
//		String obj_st = obj_st.toString();
		
		
	}

}
