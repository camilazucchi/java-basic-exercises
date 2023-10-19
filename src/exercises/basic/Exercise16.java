package exercises.basic;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        /* 16. Write a Java program to add two binary numbers.
        Input Data:
        Input first binary number: 10
        Input second binary number: 11
        Expected Output
        Sum of two binary numbers: 101
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the first binary number: ");
        String binary1 = scanner.next();

        System.out.println("Please, enter the second binary number: ");
        String binary2 = scanner.next();

        // Convert the binary numbers to integers:
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        // Perform addition:
        int sum = decimal1 + decimal2;

        // Convert the result back to binary:
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Sum of two binary numbers: " + binarySum);

        scanner.close();
    }

}
