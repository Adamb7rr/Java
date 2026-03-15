import java.util.Scanner;

public class main{
    public static void main(String[] args){
        double amount;
        double rate;
        int compunded_per_year;
        int year;
        double res;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        amount = scanner.nextDouble();
        System.out.print("Enter the rate: ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the compunded_per_year: ");
        compunded_per_year = scanner.nextInt();
        System.out.print("Enter the years: ");
        year = scanner.nextInt();
        scanner.close();

        res = amount * Math.pow(1 + rate / compunded_per_year, compunded_per_year * year);
        System.out.println("The amount after " + year + " years " + "is " + res );
    }
}
