package collectionFrameworks.mapTut.hashTableTut;

import java.util.Hashtable;

/* Hashtable is a legacy class in Java that stores data in key-value pairs, just like HashMap. - it implements Map
* HashTable is Synchronized
* neither key nor value can be null
* legacy class and is now replaced by ConcurrentHashMap
* Only linkedList is used in case of Collision unlike HashMap that uses Red Black Tree after 8 threshHold limit*/
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> students = new Hashtable<>();
        students.put(101, "Zubair");
        students.put(102, "Ahmed");
        students.put(103, "John");

        System.out.println(students);

    }
}

/* Hashtable is a legacy, synchronized implementation of the Map interface that stores key-value pairs using hashing. Its methods are synchronized, it does not allow null keys or null values, and it does not guarantee ordering. For modern applications, HashMap is generally preferred for non-thread-safe use and ConcurrentHashMap for concurrent use. */