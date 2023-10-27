package exercises.collection.linkedList;

import java.util.LinkedList;

public class Exercise05 {
    public static void main(String[] args) {
        /* 5. Write a Java program to insert the specified element at the specified position in the linked list.
        /* The specified element is "Yellow" and the specified position is "1". */
        LinkedList<String> colorsList = new LinkedList<>();

        colorsList.add("Red"); // 0
        colorsList.add("Green"); // 1
        colorsList.add("Black"); // 2
        colorsList.add("White"); // 3
        colorsList.add("Pink"); // 4

        // Print the list before adding the specified element:
        System.out.println(colorsList);

        // Add the specified element to the specified position:
        colorsList.add(1, "Yellow");

        // Print the list after adding the specified element:
        System.out.println(colorsList);
    }
}
