package newJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Star {
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String [] args) throws IOException {
		System.out.println("\uD83D\uDE00"); //GRINNING FACE EMOJI
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Created File Name : ");
		String Name = sc.nextLine();
		
		File myObj = new File("C:\\Users\\jay.p3\\Desktop\\"+Name);
        if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
		FileWriter fileWriter = new FileWriter("C:\\Users\\jay.p3\\Desktop\\"+Name);
		
		
//		public static void gc() {
//			System.out.print();
//		}
		
		
	}

}
