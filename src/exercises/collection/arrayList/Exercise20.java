package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise20 {
    public static void main(String[] args) {
        /* 20. Write a Java program to increase an array list size. */
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");

        // Print the array list:
        System.out.println("Original array list: " + c1);

        // Increase capacity to 6
        c1.ensureCapacity(6);

        // Add new elements to the array list:
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");

        // Print the new array list:
        System.out.println("The new array list is: " + c1);
    }
}
