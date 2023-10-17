package exercises;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        /* 7. Write a Java program that takes a number as input and prints its multiplication
        table up to 10.
        Test Data:
        Input a number: 8
        Expected Output:
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the number you wish to see the multiplication table: ");
        int inputNumber = scanner.nextInt();

        /* Enters a loop that iterates 10 times (for values of i from 0 to 9) */
        for (int i = 0; i < 10; i++) {
            System.out.println(inputNumber + " x " + (i + 1) + " = " + (inputNumber * ( i + 1)));
        }
    }
}
