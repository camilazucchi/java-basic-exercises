package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise01 {
    public static void main(String[] args) {
        /* 1. Write a Java program to create an array list, add some colors (strings) and print out
        the collection. */

        ArrayList<String> listColors = new ArrayList<>();
        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Orange");
        listColors.add("White");
        listColors.add("Black");

        System.out.println(listColors);
    }
}
