package exercises.collection.linkedList;

import java.util.LinkedList;

public class Exercise01 {
    public static void main(String[] args) {
        /* 1. Write a Java program to append the specified element to the end of a linked list. */

        /* Important note: A LinkedList adds elements to the end of the list by default when we use the "add()"
        method. This means that elements are appended to the list in the order they are added, so
        the last element added will be the last in the list! */
        LinkedList<String> colorsList = new LinkedList<>();

        // Using the "add()" method to add elements to the Linked List:
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");
        colorsList.add("White");
        colorsList.add("Purple");
        colorsList.add("Yellow");

        // Iterate the Linked List and printing the elements (colors):
        for (String color : colorsList) {
            System.out.println("Color: " + color);
        }
    }
}
