package exercises;

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

        // Converte os números binários em inteiros:
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        // Realiza a adição:
        int sum = decimal1 + decimal2;

        // Converte o resultado de volta para binário:
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Sum of two binary numbers: " + binarySum);

        scanner.close();
    }

}
