package collectionFrameworks.mapTut.sortedMapTut;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/* A SortedMap is a Map that keeps its keys sorted according to a defined ordering.
SortedMap<K, V> is an interface in Java's Collections Framework.
* Map<K,V>
   │
   └── SortedMap<K,V> - interface
          │
          └── NavigableMap<K,V> - interface
                 │
                 └── TreeMap<K,V> - implemented class
                 */
public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> students = new TreeMap<>((a, b) -> b-a); // Note: SortedMap sorts according to keys, not values.
        students.put(103, "Zubair");
        students.put(101, "Ahmed");
        students.put(102, "Ali");

        System.out.println(students); // here sorting is done as per the key
        System.out.println(students.firstKey());
        System.out.println(students.lastKey());
        System.out.println(students.headMap(102)); // here 102 remains excluded

//        Navigable Map
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "one");
        navigableMap.put(5, "Five");
        navigableMap.put(3, "Three");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.ceilingKey(3));
        System.out.println(navigableMap.ceilingKey(4));
        System.out.println(navigableMap.higherKey(1));
        System.out.println(navigableMap.descendingMap());
    }
}
