package hello;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = scanner.nextLine();

        System.out.print("What is your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is " + gpa);

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

        // to clear input buffer, ie '\n', use scanner.nextLine(); but do not assign it to anything
        /*
        eg:
            if you are accepting an integer then a string, input is taken as '<integer>\n'

            int number = scanner.nextInt();
            scanner.nextLine();

            this takes care of the input buffer
         */

        scanner.close();
    }
}
