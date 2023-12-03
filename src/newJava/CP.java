package newJava;

import java.util.Scanner;

public class CP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements in the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create an array of strings with the specified size
        String[] stringArray = new String[n];

        // Input the elements into the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            stringArray[i] = scanner.nextLine();
        }

        // Get the string to search for from the user
        System.out.print("Enter the string to search for: ");
        String searchString = scanner.nextLine();

        // Search for the string in the array
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (stringArray[i].equals(searchString)) {
                index = i;
                break;
            }
        }

        // Display the result
        if (index != -1) {
            System.out.println("The string '" + searchString + "' was found at index " + index + " in the array.");
        } else {
            System.out.println("The string '" + searchString + "' was not found in the array.");
        }

        scanner.close();
    }
}

