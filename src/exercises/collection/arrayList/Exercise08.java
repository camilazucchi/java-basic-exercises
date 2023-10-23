package exercises.collection.arrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercise08 {
    public static void main(String[] args) {
        /* 8. Write a Java program to sort a given array list. */
        ArrayList<String> listColors = new ArrayList<>();
        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Orange");
        listColors.add("White");
        listColors.add("Black");

        // Print the list before sorting:
        System.out.println("Before sorting the ArrayList: " + listColors);

        // Sort the list:
        listColors.sort(Comparator.naturalOrder());

        // Print the list after sorting:
        System.out.println("After sorting the ArrayList: " + listColors);
    }
}
