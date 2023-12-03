package newJava;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Files {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args)throws IOException {
		        String simple = "";
		        String reverse ="";
		       Scanner sc = new Scanner(System.in);

		        // Passing the path to the file as a parameter
		        FileReader fr = new FileReader(
		                "C:\\Users\\jay.p3\\Desktop\\test.txt");

		        // Declaring loop variable
		        int i;
		        // Holds true till there is nothing to read
		        while ((i = fr.read()) != -1) {
		            simple = simple + (char) i;
		            // Print all the content of a file
		            System.out.print((char) i);
		        }
		        StringBuilder input1 = new StringBuilder();

		        // append a string into StringBuilder input1
		        input1.append(simple);

		        // reverse StringBuilder input1
		       System.out.println(" Reverse "+ input1.reverse());
		       
		       
		       
		       
		       System.out.println("\n");
		       
		       for(int i1=simple.length()-1; i1>=0; i1--) {
		             
		            //picking one by one character and concatenating it with reverse
		            reverse =  (reverse) + (simple.charAt(i1));
		        }
		         
		        //Final output
		        System.out.println("The reverse of "+simple+" is "+reverse);
	}

}
