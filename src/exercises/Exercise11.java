package exercises;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        /* 11. Write a Java program to print the area and perimeter of a circle.
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        scanner.close();
    }
}
