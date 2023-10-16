package exercises;

import java.util.Scanner;

public class Exercise0203 {
    public static void main(String[] args) {
        /* While working on the previous calculator exercises,
        I decided to combine both of them into one using a switch statement. */
        Scanner scanner = new Scanner(System.in);

        int menuOption;
        do {
            System.out.println("""
                    -- SIMPLE CALCULATOR MENU --
                    1 - Sum two numbers
                    2 - Divide two numbers
                    3 - Exit calculator
                    Please, choose an option from the menu above.""");
            menuOption = scanner.nextInt();

            if (menuOption == 3) {
                System.out.println("Exiting calculator...");
                break;
            }

            System.out.println("Please, enter the first number: ");
            double firstNumber = scanner.nextDouble();
            System.out.println("Please, enter the second number: ");
            double secondNumber = scanner.nextDouble();

            switch (menuOption) {
                case 1:
                    double sumOfInputNumbers = firstNumber + secondNumber;
                    System.out.println("The sum of the two numbers is: " + sumOfInputNumbers);
                    break;
                case 2:
                    if (firstNumber != 0 && secondNumber != 0) {
                        double divofInputNumbers = firstNumber / secondNumber;
                        System.out.println("The divide of the two numbers is: " + divofInputNumbers);
                    } else {
                        System.out.println("Cannot divide by zero. Please choose another option.");
                    }
                    break;
                default:
                    System.out.println("Invalid option, please choose another option from the menu.");
                    break;
            }
        } while (true);

        scanner.close();
    }


}
