package newJava;

import java.util.Scanner;

public class StringJava {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Text : ");
        String Text = scanner.nextLine();

        String [] words = Text.split(" ");

        System.out.print("Your text in Array : ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.print("Enter Your Words of Sentence if you Find That index Location :- ");
        String wordToFind = scanner.next();
        
        int index = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(wordToFind)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The Position of word ("+wordToFind+") in index is :- " + index);
        } else {
            System.out.println("The Word ("+wordToFind+") is not Found!");
        }

        scanner.close();
    }
}