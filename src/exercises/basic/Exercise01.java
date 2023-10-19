package exercises.basic;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /* 1. Write a Java program to print 'Hello' on screen and your name on a separate line.
        Expected Output:
        Hello
        Alexandra Abramov */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name:");
        String nameInput = scanner.nextLine();

        System.out.println("Hello\n" + nameInput);

        scanner.close();
    }
}
