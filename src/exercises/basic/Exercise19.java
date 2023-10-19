package exercises.basic;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        /* 19. Write a Java program to convert a decimal number to a hexadecimal number.
        Input Data:
        Input a decimal number: 15
        Expected Output
        Hexadecimal number is: F
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the decimal number you want to convert to a hexadecimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to hexadecimal:
        /* Integer.toHexString() returns a string representation of the integer argument as an unsigned integer
        in base 16. */
        String hexadecimalNumber = Integer.toHexString(decimalNumber);

        System.out.println("Hexadecimal number is: " + hexadecimalNumber.toUpperCase());

        scanner.close();
    }
}
