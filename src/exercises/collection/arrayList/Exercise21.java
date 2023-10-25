package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise21 {
    public static void main(String[] args) {
        /* 21. Write a Java program to replace the second element of an ArrayList
        with the specified element. */
        ArrayList<String> c1 = new ArrayList<>();

        // Add elements the specified elements to the array list:
        c1.add("Red");
        c1.add("Green");

        // Print the current array list:
        System.out.println("The original array list is: " + c1);

        // Replace the second element with the specified element:
        c1.set(1, "White");

        // Print the array list with the replaced element:
        System.out.println("The array list is now: " + c1);
    }
}
