package exercises.conditionals;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        /* 2. Write a Java program to solve quadratic equations (use if, else if and else).
        Test Data
        Input a: 1
        Input b: 5
        Input c: 1
        Expected Output:
        The roots are -0.20871215252208009 and -4.7912878474779195 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a: ");
        double a = scanner.nextDouble();

        System.out.println("Please, enter b: ");
        double b = scanner.nextDouble();

        System.out.println("Please, enter c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }

        scanner.close();
    }
}
