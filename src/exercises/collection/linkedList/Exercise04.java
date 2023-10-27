package exercises.collection.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise04 {
    public static void main(String[] args) {
        /* 4. Write a Java program to iterate a linked list in reverse order. */
        LinkedList<String> groceriesList = new LinkedList<>();

        // Using the "add()" method to add elements to the Linked List:
        groceriesList.add("Passion fruit");
        groceriesList.add("Strawberries");
        groceriesList.add("Salt");
        groceriesList.add("Rice");
        groceriesList.add("Vinegar");

        // Print the linked list before iterating:
        System.out.println("Original groceries linked list: ");
        for (String grocery : groceriesList) {
            System.out.println(grocery);
        }

        /* The "descendingIterator()" method of "java.util.LinkedList" class is used to return an iterator over the
        elements in a LinkedList in reverse sequential order. The elements will be returned in order from last (tail)
        to first (head). */

        Iterator<String> listIterator = groceriesList.descendingIterator();

        // Print the linked list after iterating in reverse order:
        System.out.println("\nGroceries linked list in reverse order: ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }
}
