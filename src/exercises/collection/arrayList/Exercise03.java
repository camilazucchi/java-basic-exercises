package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise03 {
    public static void main(String[] args) {
        /* 3. Write a Java program to insert an element into the array list at the first position. */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);

        System.out.println(numbers);

        /* The add(int index, E element) method of Java ArrayList class inserts a specific element in a specific index
        of ArrayList. It shifts the element of indicated index if exist and subsequent elements to the right.*/
        numbers.add(0, 10);

        System.out.println(numbers);
    }
}
