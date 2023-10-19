package exercises.conditionals;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /* 1. Write a Java program to get a number from the user and print whether it is positive
        or negative.
        Test Data
        Input number: 35
        Expected Output:
        Number is positive */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber > 0) {
            System.out.println("Number is positive.");
        } else if (inputNumber < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        scanner.close();
    }
}
