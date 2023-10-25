package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise17 {
    public static void main(String[] args) {
        /* 17. Write a Java program to empty an array list. */
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Print the array list:
        System.out.println(c1);

        // Empty the array list:
        c1.clear();

        // Print the empty array list:
        if (c1.isEmpty()) {
            System.out.println("The array list is empty.");
        } else {
            System.out.println(c1);
        }
    }
}
