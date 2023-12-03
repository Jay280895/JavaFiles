package inheritance_LearnVern;

public class HexagoneDemo {
    public static void main(String[] args) {
        int size = 6; // Size of the Hexagone

        int spaces = size - 1;
        int stars = size;

        // Loop for rows
        for (int i = 1; i <= size * 2 - 1; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

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
        }
    }
}
