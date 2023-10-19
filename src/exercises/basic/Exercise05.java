package exercises.basic;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        /* 5. Write a Java program that takes two numbers as input and displays the product
        of two numbers.
        Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output:
        25 x 5 = 125
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please, enter the second number: ");
        int secondNumber = scanner.nextInt();
        int productOfNumbers = firstNumber * secondNumber;
        System.out.println(firstNumber + " x " + secondNumber + " = " + productOfNumbers);

        scanner.close();
    }
}
