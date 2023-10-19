package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise04 {
    public static void main(String[] args) {
        /* 4. Write a Java program to retrieve an element (at a specified index) from a given array list. */
        ArrayList<String> listColors = new ArrayList<>();
        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Orange");
        listColors.add("White");
        listColors.add("Black");

        // Print the list with all the elements:
        System.out.println(listColors);

        // Retrieve the first element:
        String element = listColors.get(0);
        System.out.println("The first color is: " + element);

        // Retrieve the third element:
        element = listColors.get(2);
        System.out.println("The third color is: " + element);
    }
}
