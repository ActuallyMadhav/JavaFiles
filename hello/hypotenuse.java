package hello;
import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side #1: ");
        double a = scanner.nextDouble();
        System.out.println("Enter side #2: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("Hypotenuse = " + c);

        scanner.close();
    }
}
