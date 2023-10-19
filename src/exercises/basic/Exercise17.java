package exercises.basic;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        /* 17. Write a Java program to multiply two binary numbers.
        Input Data:
        Input the first binary number: 10
        Input the second binary number: 11
        Expected Output
        Product of two binary numbers: 110
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the first binary number: ");
        String binary1 = scanner.next();

        System.out.println("Please, enter the second binary number: ");
        String binary2 = scanner.next();

        // Convert the binary numbers to integers:
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        // Perform the multiplication:
        int multiply = decimal1 * decimal2;

        // Convert the result back to binary:
        String binaryMultiply = Integer.toBinaryString(multiply);

        System.out.println("Product of two binary numbers: " + binaryMultiply);
    }
}
