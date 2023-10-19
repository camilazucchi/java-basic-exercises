package exercises.basic;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        /* 2. Write a Java program to print the sum of two numbers.
        Test Data:
        74 + 36
        Expected Output:
        110 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- SUM CALCULATOR --");
        System.out.println("Please, enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Please, enter the second number: ");
        double secondNumber = scanner.nextDouble();
        int sumOfNumbers = (int) firstNumber + (int) secondNumber;
        System.out.println("The sum of the two numbers is: " + sumOfNumbers);

        scanner.close();
    }
}
