package exercises;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        /* 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder
        of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output:
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the first number: ");
        double inputFirstNumber = scanner.nextDouble();

        System.out.println("Please, enter the second number: ");
        double inputSecondNumber = scanner.nextDouble();

        int sumInputNumbers = (int) inputFirstNumber + (int) inputSecondNumber;
        int subtractInputNumbers = (int) inputFirstNumber - (int) inputSecondNumber;
        int multiplyInputNumbers = (int) inputFirstNumber * (int) inputSecondNumber;
        int divideInputNumbers = (int) inputFirstNumber / (int) inputSecondNumber;
        int remainderInputNumbers = (int) inputFirstNumber % (int) inputSecondNumber;

        System.out.println(inputFirstNumber + " + " + inputSecondNumber + " = " + sumInputNumbers);
        System.out.println(inputFirstNumber + " - " + inputSecondNumber + " = " + subtractInputNumbers);
        System.out.println(inputFirstNumber + " x " + inputSecondNumber + " = " + multiplyInputNumbers);
        System.out.println(inputFirstNumber + " / " + inputSecondNumber + " = " + divideInputNumbers);
        System.out.println(inputFirstNumber + " mod " + inputSecondNumber + " = " + remainderInputNumbers);

        scanner.close();
    }
}
