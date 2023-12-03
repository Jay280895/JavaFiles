package newJava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BankAccount {
    private String accountHolderName;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}

public class CC {
    @SuppressWarnings("unused")
	private static final String FILE_PATH = "C:\\Users\\jay.p3\\Desktop\\Account.txt";

    private static List<BankAccount> accounts = new ArrayList<>();

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Account Holder");
            System.out.println("2. Save Account Holders to File");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder's name: ");
                    String accountHolderName = scanner.nextLine();
                    BankAccount account = new BankAccount(accountHolderName);
                    accounts.add(account);
                    System.out.println("Account holder added successfully.");
                    break;

                case 2:
                    saveAccountHoldersToFile();
                    System.out.println("Account holders saved to file.");
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void saveAccountHoldersToFile() {
        try (FileWriter writer = new FileWriter("C:\\Users\\jay.p3\\Desktop\\Account.txt")) {
            for (BankAccount account : accounts) {
                writer.write(account.getAccountHolderName() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error: Unable to save account holders to file.");
            e.printStackTrace();
        }
    }
}

