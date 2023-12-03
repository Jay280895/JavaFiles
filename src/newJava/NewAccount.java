package newJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewAccount {

	public static void main(String[] args) throws IOException{

	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	    BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\jay.p3\\Desktop\\Account.txt"));
	    try {
	        String inputLine = null;
	        do {
	            inputLine=in.readLine();
	            out.write(inputLine);
	            out.newLine();
	        } while (!inputLine.equalsIgnoreCase("eof"));
	        System.out.print("Write Successful");
	    } catch(IOException e1) {
	        System.out.println("Error during reading/writing");
	    } finally {
	        out.close();
	        in.close();
	    }
	}

}
