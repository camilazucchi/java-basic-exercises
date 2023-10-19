package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise05 {
    public static void main(String[] args) {
        /* 5. Write a Java project to update an array element by the given element. */
        ArrayList<String> listColors = new ArrayList<>();
        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Orange");
        listColors.add("White");
        listColors.add("Black");

        // Print the list:
        System.out.println(listColors);

        // Update the third element with "Yellow":
        listColors.set(2, "Yellow");

        // Print the list with the updated element:
        System.out.println(listColors);
    }
}
