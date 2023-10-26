package exercises.collection.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise03 {
    public static void main(String[] args) {
        /* 3. Write a Java program to iterate through all elements in a linked list starting at the
        specified position. */

        LinkedList<String> colorsList = new LinkedList<>();

        // Using the "add()" method to add elements to the Linked List:
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");
        colorsList.add("White");
        colorsList.add("Purple");
        colorsList.add("Yellow");

        // Set the iterator at the specified index:
        /* "Iterator" is a basic interface provided by the Java Collections Framework to traverse through collections
        like lists, sets and maps.
        "listIterator()" is a method provided by some collection classes, such as "LinkedLists", which returns a
        "ListIterator" object. */
        Iterator<String> position = colorsList.listIterator(1);

        // Print the list from the second position:
        while (position.hasNext()) {
            System.out.println(position.next());
        }

        // Trying again...
        LinkedList<String> groceriesList = new LinkedList<>();
        /* Important note: A "LinkedList" in Java is a doubly-linked list implementation. While each element in the
        list has a reference to both the previous and next elements, it does not support direct indexing like an array
        ir an array-based list (such as "ArrayList")...
        However, we can use the "listIterator(int index)" method of the "LinkedList" class to obtain a "ListIterator"
        that allows us to traverse the list starting from a specific position! */

        groceriesList.add("Banana"); // Index 0
        groceriesList.add("Potatoes"); // Index 1
        groceriesList.add("Rice"); // Index 2
        groceriesList.add("Vinegar"); // Index 3

        Iterator<String> listIterator = groceriesList.listIterator(1);

        System.out.println("\nGroceries List");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
