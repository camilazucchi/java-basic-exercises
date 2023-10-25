package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise22 {
    public static void main(String[] args) {
        /* 22. Write a Java program to print all the elements of an ArrayList using
        the elements position. */
        ArrayList<String> c1 = new ArrayList <String> ();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Print the array list:
        System.out.println("Original array list: " + c1);
        System.out.println("Printing while using the index of each element: ");

        int numberOfElements = c1.size();
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println(c1.get(i));
        }
    }
}
