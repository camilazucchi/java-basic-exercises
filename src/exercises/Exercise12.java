package exercises;

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

        System.out.println("Please, enter the first number: ");
        int inputFirstNumber = scanner.nextInt();

        System.out.println("Please, enter the second number: ");
        int inputSecondNumber = scanner.nextInt();

        System.out.println("Please, enter the third number: ");
        int inputThirdNumber = scanner.nextInt();

        System.out.println("Please, enter the fourth number: ");
        int inputFourthNumber = scanner.nextInt();

        System.out.println("Please, enter the fifth number: ");
        int inputFifthNumber = scanner.nextInt();

        int sumOfInputNumbers = inputFirstNumber + inputSecondNumber + inputThirdNumber + inputFourthNumber + inputFifthNumber;
        int averageOfInputNumbers = sumOfInputNumbers / 5;

        System.out.println("The average of the three numbers is: " + averageOfInputNumbers);

        scanner.close();
    }
}
