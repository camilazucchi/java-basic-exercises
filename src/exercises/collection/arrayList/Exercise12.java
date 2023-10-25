package exercises.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise12 {
    public static void main(String[] args) {
        /* 12. Write a Java program to extract a portion of an array list. */
        // Create a list and add colors to the list:
        List<String> colorsList = new ArrayList<>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Orange");
        colorsList.add("White");
        colorsList.add("Black");

        // Print the list before extracting:
        System.out.println(colorsList);

        /* The "subList()" method of "java.util.ArrayList" class is used to return a view of the portion
        of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        Parameters:
        - fromIndex - low endpoint (inclusive) of the subList.
        - toIndex - high endpoint (exclusive) of the subList. */
        List<String> subList = colorsList.subList(0, 3);

        System.out.println(subList);
    }
}
