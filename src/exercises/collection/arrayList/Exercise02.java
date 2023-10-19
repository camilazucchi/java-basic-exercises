package exercises.collection.arrayList;

import java.util.ArrayList;

public class Exercise02 {
    public static void main(String[] args) {
        /* 2. Write a Java program to iterate through all elements in an array list. */

        ArrayList<String> listColors = new ArrayList<>();
        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Orange");
        listColors.add("White");
        listColors.add("Black");

        for (String color : listColors) {
            System.out.println("Color: " + color);
        }
    }
}
