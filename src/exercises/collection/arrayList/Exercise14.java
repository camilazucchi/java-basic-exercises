package exercises.collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise14 {
    public static void main(String[] args) {
        /* 14. Write a Java program that swaps two elements in an array list.*/
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");
        colorsList.add("White");
        colorsList.add("Pink");

        // Print the array before swapping:
        for (String color : colorsList) {
            System.out.println(color);
        }

        // Swapping the elements:
        /* The "swap()" method of "java.util.Collections" class is used to swap the elements at the
        specified positions in the specified list.
        Parameters:
        - list - the list in which to swap elements.
        - i - the index of one element to be swapped.
        - j - the index of the other element to be swapped. */
        System.out.println("-- Swapping elements i: 0 and j: 2 --");
        Collections.swap(colorsList, 0, 2);

        // Print the array after swapping:
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}
