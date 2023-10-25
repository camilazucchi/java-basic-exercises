package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise16 {
    public static void main(String[] args) {
        /* 16. Write a Java program to clone an array list to another array list. */
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Print the first array list:
        System.out.println("First array: " + c1);

        // Clone the first array list:
        ArrayList<String> clonedArray = (ArrayList<String>)c1.clone();

        // Print the second array list:
        System.out.println("Cloned array: " + clonedArray);
    }
}
