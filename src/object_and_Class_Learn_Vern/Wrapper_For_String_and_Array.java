package object_and_Class_Learn_Vern;

import java.util.ArrayList;
public class Wrapper_For_String_and_Array {
	
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		//Integer obj_i = new Integer(1234);
		//or
		Integer obj_i = 1234;
		
		String obj_s = obj_i.toString();
		
		System.out.println("The Length of Integer is "+obj_s.length()+" Digits");
		
		
		
		ArrayList <Integer> myNumbers = new ArrayList <Integer>(); 
		ArrayList <Integer> MYNumbers = new ArrayList <Integer>(); 
		myNumbers.add(1);
		myNumbers.add(2);
		myNumbers.add(3);
		myNumbers.add(4);
		for(int element : myNumbers) {
			System.out.println(element);
		}
		
	}

}
