package inheritance_LearnVern;

import java.util.Arrays;
import java.util.List;

public class Hexagone {
    public static void main(String[] args) {
        int size = 6; // Size of the Hexagon

        int spaces = size - 1;
        int stars = size;

        List<String> colors = Arrays.asList(
                "\u001B[35m", // Magenta
                "\u001B[36m", // Cyan
                "\u001B[33m", // Yellow
                "\u001B[32m", // Green
                "\u001B[34m"  // Blue
        );

        int colorIndex = 0;

        // Loop for rows
        for (int i = 1; i <= size * 2 - 1; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Change color
            System.out.print(colors.get(colorIndex));

            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("**");
            }

            // Move to the next line
            System.out.println();

            if (i < size) {
                spaces--;
                stars++;
            } else {
                spaces++;
                stars--;
            }

            // Change color for the next iteration
            colorIndex = (colorIndex + 1) % colors.size();
        }

        // Reset color to default after drawing the hexagon
        System.out.print("\u001B[0m");
    }
}
