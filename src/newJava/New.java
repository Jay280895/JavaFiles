package newJava;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Array size input from the user
        System.out.print("Enter the size of the array: ");
        int size = inputScanner.nextInt();
        inputScanner.nextLine(); // Consume the newline character

        // Create a String array of the specified size
        String[] stringArray = new String[size];

        // Input elements into the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            stringArray[i] = inputScanner.nextLine();
        }

        // Display the array elements along with their index
        System.out.println("Array elements with their index values:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + stringArray[i]);
        }

        inputScanner.close();
    }
}
