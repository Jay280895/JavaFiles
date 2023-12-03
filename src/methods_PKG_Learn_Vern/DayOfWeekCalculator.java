package methods_PKG_Learn_Vern;

import java.util.Scanner;

public class DayOfWeekCalculator {
    public static void main(String[] args) {
    	
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
     
    	System.out.print("Enter the present Day : ");
        String PresentDay = sc.nextLine();

        System.out.print("If you want to know what day it is after how many days, enter the number : ");
        int AfterDays = sc.nextInt();

        // Calculate the adjusted number of days to add
        int adjustedAfterDays = AfterDays % 7;

        // Create a map to represent the days of the week
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Find the index of the current day
        int currentIndex = -1;
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (PresentDay.equals(daysOfWeek[i])) {
                currentIndex = i;
                break;
            }
        }

        if (currentIndex != -1) {
            // Calculate the future day of the week
            int futureIndex = (currentIndex + adjustedAfterDays) % 7;
            String futureDayOfWeek = daysOfWeek[futureIndex];

            System.out.println("Current day of the week: " + PresentDay);
            System.out.println("Future day of the week after " + AfterDays + " days: " + futureDayOfWeek);
        } else {
            System.out.println("Invalid current day of the week.");
        }
    }
}
