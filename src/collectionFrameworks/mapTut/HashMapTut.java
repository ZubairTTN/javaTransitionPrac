package collectionFrameworks.mapTut;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* Map does not extend the Collection interface */
public class HashMapTut {
    public static void main(String[] args) {
         Map<Integer, String> map = new HashMap<>(17, 0.9f); // Map is an interface and HashMap is an implementation class

        HashMap<Integer, String> students = new HashMap<>();
        students.put(12, "Zubair"); // O(1)
        students.put(23, "Ahmed"); // O(1)
        students.put(34, "Mohd");
        students.put(4, "Akshit");
//        students.put(null, "Sonu"); // Map can have max one null key
//        students.put(56, null); // Map can have multiple null values
//        students.put(72, null);
        System.out.println(students.get(3)); // this will give null
        System.out.println(students.get(34)); // O(1)
        System.out.println(students.containsKey(23));
        System.out.println(students.containsValue("Zubair"));
        System.out.println(students);

        for (Map.Entry<Integer, String> student: students.entrySet())
        {
            student.setValue(student.getValue().toUpperCase());
            System.out.println(student.getKey() + ": " + student.getValue());

        }
        students.put(4, "Akshita"); // value will be replaced

        Set<Integer> studKeys = students.keySet(); // this returns Set as Keys are unique
        System.out.println(students.values()); // this returns Collection<String>
        System.out.println(students.entrySet());
        students.forEach((key, value) -> {
            System.out.println(key +  " -> " + value);
        });





    }
}


/* TREEIFY_THRESHOLD
8
When a bucket's node count reaches around this threshold, HashMap considers treeification.

However, there is another important condition.
MIN_TREEIFY_CAPACITY
64

If the table is smaller than 64, HashMap generally prefers resizing the table instead of treeifying. */