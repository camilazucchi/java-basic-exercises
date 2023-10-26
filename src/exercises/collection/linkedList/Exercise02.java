package exercises.collection.linkedList;

import java.util.LinkedList;

public class Exercise02 {
    public static void main(String[] args) {
        /* 2. Write a Java program to iterate through all the elements in a linked list. */

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
