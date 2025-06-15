package hello;
import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args){

        // C to F -> C*1.8 + 32
        // F to C -> (F + 32) * 0.5555


        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("****** Temperature Conversion Program ******");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        choice = scanner.nextInt();

        double inputTemp, outputTemp;

        switch(choice){
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                inputTemp = scanner.nextDouble();

                outputTemp = inputTemp*1.8 + 32;

                System.out.printf("Temperature in Fahrenheit: %.2fF", outputTemp);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemp = scanner.nextDouble();

                outputTemp = (inputTemp - 32) * 0.5555;

                System.out.printf("Temperature in Fahrenheit: %.2fC", outputTemp);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
