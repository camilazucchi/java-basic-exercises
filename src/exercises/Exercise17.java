package exercises;

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

        // Converte os números binários em inteiros:
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        // Realiza a multiplicação:
        int multiply = decimal1 * decimal2;

        // Converte o resultado de volta para binário:
        String binaryMultiply = Integer.toBinaryString(multiply);

        System.out.println("Product of two binary numbers: " + binaryMultiply);
    }
}
