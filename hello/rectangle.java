package hello;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args){
        double length = 0, width = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter width: ");
        width = scanner.nextDouble();
        scanner.nextLine();

        double area = length * width;

        System.out.println("Rectangle Area: " + area);

        scanner.close();
    }
}
