import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 0;
        double amount;
        int choice;
        boolean isRun = true;
        Scanner scanner = new Scanner(System.in);

        // Home
        while (isRun) {

            System.out.println("BANKING PROGRAM");
            System.out.println("*".repeat(10));

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*".repeat(10));
            System.out.print("Enter Your choice (1-4): ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("$" + balance);
            } else if (choice == 2) {
                System.out.print("Enter the amount: ");
                amount = scanner.nextDouble();
                balance += amount;
                System.out.println("Done");
            } else if (choice == 3) {
                System.out.print("Enter the amount: ");
                amount = scanner.nextDouble();
                balance -= amount;
                System.out.println("Done");
            } else if (choice == 4) {
                System.out.println("Exit...");
                break;
            }
            
        }
        scanner.close();
    };
}