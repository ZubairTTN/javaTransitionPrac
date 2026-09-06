package collectionFrameworks.mapTut.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
/* LinkedHashMap maintains the insertion order ...
* HashMap is the superclass of: LinkedHashMap (i.e LinkedHashMap extends HashMap)
*                Map
                  |
               HashMap
                  |
             LinkedHashMap
           * */
public class LinkedHashMapTut {
    public static void main(String[] args) {
//        Map<String, Integer> map = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(10, .9f, true); /* LinkedHashMap can maintain either insertion order or access order. When accessOrder is set to true in its constructor, entries are maintained based on their access history. When an existing entry is accessed, such as through get(), it is moved to the end of the linked list, making it the most recently accessed entry. This behavior is particularly useful for implementing LRU caches. */
        linkedHashMap.put("Zubair", 98);
        linkedHashMap.put("Kaici", 88);
        linkedHashMap.put("Akshita", 76);
        linkedHashMap.put("Chanda", 89);
//        linkedHashMap.get("Akshita");

        for (Map.Entry<String, Integer> entry: linkedHashMap.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nUsing Lambda Expression...");
        linkedHashMap.forEach((student, marks) -> {
            System.out.println(student + "-> " + marks);
        });
    }
}

/*
* How does LinkedHashMap work internally?

This is where it gets interesting.

HashMap internally has a bucket array:

table
┌─────┬─────┬─────┬─────┬─────┐
│  0  │  1  │  2  │  3  │  4  │ ...
└─────┴─────┴─────┴─────┴─────┘

Each bucket can contain Nodes.

LinkedHashMap still uses this hashing/bucket structure.

But its entries additionally maintain links between entries.

Conceptually, a LinkedHashMap entry contains:

hash
key
value
next
before
after

The first four are related to the HashMap structure.

The additional:

before
after

are what allow LinkedHashMap to maintain its linked ordering.
*  */
