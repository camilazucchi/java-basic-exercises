package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise06 {
    public static void main(String[] args) {
        /* 6. Write a Java program to remove the third element from an array list. */
        ArrayList<String> listColors = new ArrayList<>();
        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Orange");
        listColors.add("White");
        listColors.add("Black");

        // Print the list:
        System.out.println(listColors);

        // Remove the third element from the list:
        listColors.remove(2);

        // Print the list without the third element:
        System.out.println("After removing the third element from the list: " + listColors);
    }
}
