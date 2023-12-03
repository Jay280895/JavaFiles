package classes;
import java.util.*;
public class questions {
    public void bonus_Checker(){
        @SuppressWarnings("resource")
		Scanner serviceYear=new Scanner(System.in);
        System.out.println("Enter Your Service year -");
        int servicePeriod = serviceYear.nextInt();
        if (servicePeriod>5) {
            System.out.println("Enter your salary -");
            int salary=serviceYear.nextInt();
            int bonusAmt=salary*5/100;
            System.out.println("You will get the Bonus amt"+ bonusAmt);
        }
        else {
            System.out.println("Your are not eligible for the Bonus");
        }
    }
}
