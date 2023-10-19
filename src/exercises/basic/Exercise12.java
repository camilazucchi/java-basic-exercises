package exercises.basic;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        /* 12. Write a Java program that takes three numbers as input to calculate and print
        the average of the numbers.
        Test Data:
        Input first number: 10
        Input second number: 20
        Input third number: 30
        Input fourth number: 40
        Input fifth number: 50
        */
        Scanner scanner = new Scanner(System.in);
        int numCount = 5;
        int[] inputNumbers = new int[numCount];
        int sumOfInputNumbers = 0;

        for (int inputCount = 0; inputCount < numCount; inputCount++) {
            System.out.print("Please enter number " + (inputCount + 1) + ": ");
            if (scanner.hasNextInt()) {
                inputNumbers[inputCount] = scanner.nextInt();
                sumOfInputNumbers += inputNumbers[inputCount];
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();  // Clear the input buffer
                inputCount--;  // Decrement inputCount to re-enter the same number
            }
        }

        int averageOfInputNumbers = sumOfInputNumbers / numCount;

        System.out.println("The average of the five numbers is: " + averageOfInputNumbers);

        scanner.close();
    }
}
