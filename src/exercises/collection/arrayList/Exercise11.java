package exercises.collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise11 {
    public static void main(String[] args) {
        /* 11. Write a Java program to reverse elements in an array list. */
        // Create a list and add colors to the list:
        List<String> colorsList = new ArrayList<>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Orange");
        colorsList.add("White");
        colorsList.add("Black");

        // Print the list before the reverse:
        System.out.println(colorsList);

        // Reverse list:
        Collections.reverse(colorsList);

        // Print the list after the reverse:
        System.out.println(colorsList);
    }
}
