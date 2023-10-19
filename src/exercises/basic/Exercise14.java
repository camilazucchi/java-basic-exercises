package exercises.basic;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        /* 14. Write a Java program to swap to variables.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the first number: ");
        int inputFirstNumber = scanner.nextInt();

        System.out.println("Please, enter the second number: ");
        int inputSecondNumber = scanner.nextInt();

        System.out.println("The first number is: " + inputFirstNumber);
        System.out.println("The second number is: " + inputSecondNumber);
        System.out.println("Shuffling numbers...");

        int temporaryNumber = inputFirstNumber;
        inputFirstNumber = inputSecondNumber;
        inputSecondNumber = temporaryNumber;

        System.out.println("After shuffling... The first number is: " + inputFirstNumber);
        System.out.println("After shuffling... The second number is: " + inputSecondNumber);

        scanner.close();
    }
}
