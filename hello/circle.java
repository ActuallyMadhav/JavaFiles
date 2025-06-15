package hello;
import java.util.Scanner;
public class circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is: " + circumference);

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area is: " + area);
        sc.close();
    }
}
