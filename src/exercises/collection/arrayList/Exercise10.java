package exercises.collection.arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise10 {
    public static void main(String[] args) {
        /* 10. Write a Java program to shuffle elements in an array list. */
        // Create a list and add colors to the list:
        List<String> colorsList = new ArrayList<>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Orange");
        colorsList.add("White");
        colorsList.add("Black");

        // Print the list before shuffling:
        System.out.println(colorsList);

        // Shuffle the list:
        Collections.shuffle(colorsList);

        // Print the list after shuffling:
        System.out.println(colorsList);
    }
}
