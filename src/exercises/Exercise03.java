package exercises;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        /* 3. Write a Java program to divide two numbers and print them on the screen.
        Test Data:
        50/3
        Expected Output:
        16
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- DIVISION CALCULATOR --");
        System.out.println("Please, enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Please, enter the second number: ");
        double secondNumber = scanner.nextDouble();
        int divOfNumbers = (int) firstNumber / (int) secondNumber;
        System.out.println("The divide of the two numbers is: " + divOfNumbers);

        scanner.close();
    }
}
