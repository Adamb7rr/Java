import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        int guess=0;
        Random random = new Random();
        int com = random.nextInt(1, 100 + 1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-100");
        System.out.println(com);
        
        while (guess != com) {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            if (guess > com) {
                System.out.println("Too High, Try again");
            } else if (guess < com) {
                System.out.println("Too Low, Try again");
            }
        }
        System.out.println("You Win!")
        ;

        scanner.close();
    }
}