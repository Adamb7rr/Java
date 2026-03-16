import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        double fNumber;
        char op;
        double sNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        fNumber = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        op = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        sNumber = scanner.nextDouble();

        if (op == '+') {
            System.out.println(fNumber + sNumber);
        }
        else if (op == '-') {
            System.out.println(fNumber - sNumber);
        }
        else if (op == '*') {
            System.out.println(fNumber * sNumber);
        }
        else if (op == '/') {
            System.out.println(fNumber / sNumber);
        }
        else if (op == '^') {
            System.out.println(Math.pow(fNumber, sNumber));
        }
        scanner.close();
    }
}