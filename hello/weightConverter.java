package hello;
import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args){
        // 1 kg = 2.20462 lbs
        // 1 lb = 0.453592 kgs
        System.out.println("********** Kg - Lbs Converter **********");
        System.out.println("1. Kg to Lbs");
        System.out.println("2. Lbs to Kg");
        System.out.print("Enter your choice (1 or 2): ");
        int choice;
        Scanner scanner = new Scanner(System.in);

        choice = scanner.nextInt();
        double weight, converted;

        switch(choice){
            case 1:
                System.out.print("Enter weight in Kgs: ");
                weight = scanner.nextDouble();
                converted = 2.20462 * weight;
                System.out.printf("Weight in Lbs: %.2f Lbs", converted);
                break;
            case 2:
                System.out.print("Enter weight in Lbs: ");
                weight = scanner.nextDouble();
                converted = 0.453592 * weight;
                System.out.printf("Weight in Kgs: %.2f Kgs", converted);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

        scanner.close();
    }
}
