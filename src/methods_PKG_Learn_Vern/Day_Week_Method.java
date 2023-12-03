package methods_PKG_Learn_Vern;

import java.util.Scanner;

public class Day_Week_Method {
	
	 // Function to validate if the entered day is valid
    private static boolean isValidDayOfWeek(String day) {
        String[] daysOfWeek = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        return getIndex(day, daysOfWeek) != -1;
    }

    // Function to get the index of a day in the daysOfWeek array
    private static int getIndex(String day, String[] daysOfWeek) {
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (day.equals(daysOfWeek[i])) {
                return i;
            }
        }
        return -1; // Not found
    }
    
    //Main Method 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the present day: ");
        String presentDay = sc.nextLine().toLowerCase(); // Convert input to lowercase

        if (!isValidDayOfWeek(presentDay)) {
            System.out.println("Invalid current day of the week.");
            sc.close();
            return;
        }

        System.out.print("If you want to know what day it is after how many days, enter the number: ");
        int afterDays = sc.nextInt();

        // Calculate the adjusted number of days to add
        int adjustedAfterDays = afterDays % 7;

        // Create a map to represent the days of the week
        String[] daysOfWeek = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

        // Find the index of the current day
        int currentIndex = getIndex(presentDay, daysOfWeek);

        // Calculate the future day of the week
        int futureIndex = (currentIndex + adjustedAfterDays) % 7;
        String futureDayOfWeek = daysOfWeek[futureIndex];

        System.out.println("Current day of the week: " + presentDay);
        System.out.println("Future day of the week after " + afterDays + " days: " + futureDayOfWeek);

        sc.close();
    }
}