package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise15 {
    public static void main(String[] args) {
        /* 15. Write a Java program to join two array lists. */
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Print the first array:
        System.out.println("The first array of colors is: ");
        for (String a : c1) {
            System.out.println(a);
        }

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Print the second array:
        System.out.println("The second array of colors is: ");
        for (String a : c2) {
            System.out.println(a);
        }

        // Joining the two arrays:
        ArrayList<String> c3 = new ArrayList<>();
        c3.addAll(c1);
        c3.addAll(c2);

        // Print the joined arrays:
        System.out.println("The new array of colors is: ");
        for (String a : c3) {
            System.out.println(a);
        }
    }
}
