package exercises.collection.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        /* 7. Write a Java program to search for an element in an array list. */
        ArrayList<String> listColors = new ArrayList<>();
        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Orange");
        listColors.add("White");
        listColors.add("Black");

        // Input color:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the color you are searching for in the ArrayList: ");
        String inputColor = scanner.nextLine();

        // Conditions:
        if (listColors.stream().anyMatch(color -> color.equalsIgnoreCase(inputColor))) {
            System.out.println("The color exists in the ArrayList.");
        } else {
            System.out.println("Oops, the color does not exist in the ArrayList.");
        }

        scanner.close();
    }
}
