package collectionFrameworks.listTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
* List is an interface in the Java Collections Framework.
It represents a collection where:
Elements are stored in a sequence/order
Duplicates are allowed
Every element has an index
Elements can be accessed using their index
Elements can be added, removed, or replaced */

/* ArrayList Working: When the internal array becomes full, Java creates a larger array and copies elements into it. */
public class ArrayListTut {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); // initial Capacity is 10
        System.out.println(names.getClass().getName());
        names.add("Mohd");
        names.add("Zubair");
        names.add("Ahmed");
        names.add("Sonu");
        names.add("Mohd");
        names.add("Zubair");
        names.add(1, "Chanda");
        names.set(0, "Mohammad"); // this replaces the element at index 0
        for (String name: names)
        {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println(names.get(1));

        names.remove(1);
        System.out.println(names);
        names.remove("Sonu");
        System.out.println(names);
        System.out.println(names.contains("Zubair"));
        System.out.println(names.indexOf("Zubair"));
        System.out.println(names.lastIndexOf("Zubair"));
        System.out.println(names.subList(1, 4)); // 1 is included and 4 is excluded
        System.out.println("Current Size is: " + names.size());
//        List<Integer> list = new ArrayList<>(1000);
//        System.out.println("Size of list is: " + list.size());

        List<String> name2 = Arrays.asList("Monday", "Tuesday", "Thursday"); // this returns a fixed size list, and we cannot add or remove the elements, we can only replace the pre-existing elements eg. name2.set(2, "Wednesday");
        System.out.println(name2.getClass().getName());

        List<String> name3 = List.of("Monday", "Tuesday", "Thursday"); // It creates an unmodifiable List. Unlike Arrays.asList(), you can't even use set().

        Collections.sort(names);
        System.out.println(names);


    }
}
