package hello;
import java.util.Scanner;

public class compoundCalc {
    public static void main(String[] args){
        int years;
        double principal;
        double interest;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        years = scanner.nextInt();

        System.out.print("Enter interest rate per year: ");
        interest = scanner.nextDouble();

        double amount = principal * Math.pow((1 + (interest/100)), years);

        System.out.printf("The total amount is: %.2f", amount);

        scanner.close();
    }
}
