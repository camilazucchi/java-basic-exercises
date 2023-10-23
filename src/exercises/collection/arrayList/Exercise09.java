package exercises.collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise09 {
    public static void main(String[] args) {
        /* 9. Write a Java program to copy one array list into another. */
        // Create the first ArrayList:
        ArrayList<String> List1 = new ArrayList<>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");

        // Print the first ArrayList:
        System.out.println("List1: " + List1);

        // Create the second ArrayList:
        ArrayList<String> List2 = new ArrayList<>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");

        // Print the second ArrayList:
        System.out.println("List2: " + List2);

        // Copy List2 to List1:
        /* The "copy()" method of "java.util.Collections" class is used to copy all the elements
        from one list into another. After the operation, the index of each copied element in the destination
        list will be identical to its index in the source list.
        The destination list must be as long as the source list! If it is longer, the remaining elements
        in the destination list are unaffected. */
        Collections.copy(List1, List2);
        /* Parameters:
        - dest – The destination list.
        - src – The source list.

        // Collections.copy(dest, src) ^ */

        // Print the ArrayLists after using the "copy()" method:
        System.out.println("Copy List1 to List2. After copy: ");
        System.out.println("List 1: " + List1);
        System.out.println("List 2: " + List2);
    }
}
