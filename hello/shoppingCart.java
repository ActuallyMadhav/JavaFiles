package hello;

import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int qty;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each: ");
        price = scanner.nextDouble();

        System.out.print("How many are you buying: ");
        qty = scanner.nextInt();

        total = qty * price;
        System.out.println("Your total for " + qty + " " + item + "s is : " + currency + " " + total);

        scanner.close();
    }
}
