package methods_PKG_Learn_Vern;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Days {
    @SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Prompt the user for the number of days to add
        System.out.print("Enter the number of days to add: ");
        int daysToAdd = scanner.nextInt();
        
        // Calculate the future date
        LocalDate futureDate = currentDate.plusDays(daysToAdd);
        
        // Get the day of the week for the future date
        String dayOfWeek = futureDate.getDayOfWeek().toString();
        
        // Define a formatter to make the output more user-friendly
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
        
        // Print the result
        System.out.println("Today is " + currentDate.format(formatter));
        System.out.println("After " + daysToAdd + " days, it will be " + futureDate.format(formatter));
    }
}
