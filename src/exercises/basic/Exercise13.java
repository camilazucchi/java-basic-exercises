package exercises.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        /* 13. Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.6
        Height = 8.5
        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.println("Please, enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        double area = width * height;
        double perimeter = 2 * (height + width);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        String formattedArea = decimalFormat.format(area);
        String formattedPerimeter = decimalFormat.format(perimeter);

        System.out.println("Perimeter is 2 * (" + width + " " + height + ") = " + formattedPerimeter);
        System.out.println("Area is " + width + " * " + height + " = " + formattedArea);

        scanner.close();
    }
}
