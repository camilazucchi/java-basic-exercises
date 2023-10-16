package exercises;

public class Exercise04 {
    public static void main(String[] args) {
        /* 4. Write a Java program to print the results of the following operations.
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Expected Output:
        43
        1
        19
        13
        */
        System.out.println(-5 + (8 * 6));
        System.out.println((55 + 9) % 9);
        System.out.println(20 + (-3 * 5) / 8);
        System.out.println(5 + (15 / 3) * 2 - 8 % 3);
        /* Each expression is evaluated based on the order of operations (PEMDAS/BODMAS), which determines the
        sequence of arithmetic operations.
        Note: PEMDAS stands for P - Parentheses, E - Exponents, M - Multiplication, D - Division, A - Addition,
        and S - Subtraction.
        BODMAS stands for Bracket, Of, Division, Multiplication, Addition and Subtraction.
        */
    }
}
