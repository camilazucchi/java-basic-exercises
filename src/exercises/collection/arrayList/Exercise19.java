package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise19 {
    public static void main(String[] args) {
        /* 19. Write a Java program for trimming the capacity of an array list. */
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Print the array list:
        System.out.println(c1);

        // Trim the capacity of the array list:

        /* The "java.util.ArrayList.trimToSize()" method trims the capacity of an ArrayList instance
        to be the list's current size. An application can use this operation to minimize the storage of
        an ArrayList instance. */
        c1.trimToSize();

        // Print the array list again:

        /* Nothing happens with the elements, but with the size of the array list, it'll have its
        capacity reduced to match the number of elements. */
        System.out.println(c1);
    }
}
