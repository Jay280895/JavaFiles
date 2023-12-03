package methods_PKG_Learn_Vern;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysUser {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their present date
        System.out.print("Enter your present date (yyyy-MM-dd): ");
        String presentDateStr = scanner.nextLine();
        LocalDate presentDate = LocalDate.parse(presentDateStr);
        
        // Prompt the user for the number of days to add
        System.out.print("Enter the number of days after which you want to know the day of the week: ");
        int daysToAdd = scanner.nextInt();
        
        // Calculate the future date
        LocalDate futureDate = presentDate.plusDays(daysToAdd);
        
        // Get the day of the week for the future date
        DayOfWeek dayOfWeek = futureDate.getDayOfWeek();
        
        // Define a formatter to make the output more user-friendly
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
        
        // Print the result
        System.out.println("Your present day is " + presentDate.format(formatter));
        System.out.println("After " + daysToAdd + " days, it will be " + futureDate.format(formatter));
        System.out.println("That day will be a " + dayOfWeek.toString());
        
        
        
    }
}
