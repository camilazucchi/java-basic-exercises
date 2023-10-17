package exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        /* 18. Write a program to convert an integer number to a binary number.
        Input Data:
        Input a Decimal Number: 5
        Expected Output
        Binary number is: 101
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the number you want to convert to a binary number: ");
        int number = scanner.nextInt();

        // Convert the decimal number to binary
        /* The java.lang.Integer.toBinaryString() method returns a string representation of the integer argument
        as an unsigned integer in base 2. It accepts an argument in Int data-type and returns the corresponding
        binary string. */
        String binaryNumber = Integer.toBinaryString(number);

        System.out.println("Binary number is: " + binaryNumber);
    }
}
