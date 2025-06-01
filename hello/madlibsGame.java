package hello;

import java.util.Scanner;

public class madlibsGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String adj1, noun1, adj2, verb1, adj3;

        System.out.print("Enter an adjective: ");
        adj1 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        adj2 = scanner.nextLine();

        System.out.print("Enter a verb (ending in -ing): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        adj3 = scanner.nextLine();

        System.out.println("Today, I went to a " + adj1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adj2 + " and " + verb1 + "!");
        System.out.println("I was " + adj3 + "!");

        scanner.close();
    }
}
