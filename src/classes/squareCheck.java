package classes;
import java.util.*;
public class squareCheck {
    @SuppressWarnings("resource")
	public void squareChecking(String [] args){
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Length: ");
      int length=sc.nextInt();
      System.out.println("Enter the width :");
      int width= sc.nextInt();
      if (length==width){
          int area=length*length;
         System.out.println("This is a Square and it's Area : "+area);
      }
      else {
          System.out.println("This is not a square");
      }

    }
}

