package exercises.collection.linkedList;

import java.util.LinkedList;

public class Exercise06 {
    public static void main(String[] args) {
        /* 6. Write a Java program to insert elements into the linked list at the first and last positions. */
        LinkedList<String> colorsList = new LinkedList<>();

        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");

        // Print the list before inserting the elements:
        System.out.println("Original linked list: " + colorsList);

        // Insert the elements:
        /* The "java.util.LinkedList.addFirst()" method in Java is used to insert a specific element at the
        beginning of a LinkedList. */
        colorsList.addFirst("White");
        /* The "java.util.LinkedList.addLast()" method in Java is used to insert a specific element at the end
        of a LinkedList. */
        colorsList.addLast("Pink");

        // Print the list after inserting the elements:
        System.out.println("Linked list after inserting the elements: " + colorsList);


    }
}
