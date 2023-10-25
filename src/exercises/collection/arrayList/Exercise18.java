package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise18 {
    public static void main(String[] args) {
        /* 18. Write a Java program to test whether an array list is empty or not. */
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Print the array list:
        System.out.println("Original array list: " + c1);

        // Check if the array list is empty:
        System.out.println("Is the array list empty? " + c1.isEmpty());

        // Empty the array list:
        c1.clear();

        // Print the array list again:
        System.out.println("Array list after removing all the elements: " + c1);

        // Check if the array list is empty again:
        System.out.println("Is the array list empty? " + c1.isEmpty());


    }
}
