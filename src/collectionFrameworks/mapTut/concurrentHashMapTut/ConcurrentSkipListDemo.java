package collectionFrameworks.mapTut.concurrentHashMapTut;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* ConcurrentHashMap = thread-safe + fast lookup, but no sorted order
ConcurrentSkipListMap = thread-safe + sorted keys + navigation
ConcurrentSkipListMap is a thread-safe, sorted, concurrent implementation of NavigableMap

Map
 │
 └── SortedMap
       │
       └── NavigableMap
             │
             ├── TreeMap
             │
             └── ConcurrentSkipListMap


             ConcurrentSkipListMap is a thread-safe, sorted, navigable Map that uses a Skip List internally and provides expected O(log n) operations.*/
public class ConcurrentSkipListDemo {
    public static void main(String[] args) {
//        Map<Integer, String> concurrentSkipList = new ConcurrentSkipListMap<>();
//        NavigableMap<Integer, String> concurrentSkipList1 = new ConcurrentSkipListMap<>();
//        ConcurrentMap<Integer, String> concurrentSkipList2 = new ConcurrentHashMap<>();

        ConcurrentSkipListMap<Integer, String> concurrentSkipList = new ConcurrentSkipListMap<>();
        concurrentSkipList.put(30, "C");
        concurrentSkipList.put(10, "A");
        concurrentSkipList.put(20, "B");
        System.out.println(concurrentSkipList);
        for(Map.Entry<Integer, String> entry: concurrentSkipList.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}

/* What is a Skip List?

This is the most important part to understand.

The name comes from:

Skip List

Instead of storing elements only in one normal linked list, a Skip List maintains multiple levels of linked lists.

Imagine a normal sorted linked list:

10 → 20 → 30 → 40 → 50 → 60 → 70 → 80

If you want to find 70, you may have to walk through:

10
 ↓
20
 ↓
30
 ↓
40
 ↓
50
 ↓
60
 ↓
70

That's relatively slow.

A Skip List adds express lanes.

6. Skip List with multiple levels

Conceptually:

Level 3: 10 ───────────────→ 40 ───────────────→ 70
                     │                    │
Level 2: 10 ─────→ 20 ─────→ 40 ─────→ 50 ─────→ 70
           │         │          │          │
Level 1:   ↓         ↓          ↓          ↓
           10 → 20 → 30 → 40 → 50 → 60 → 70 → 80

The upper levels skip over multiple elements.

That's where the name comes from:

Skip List
    ↓
Skip some nodes while searching
7. How searching works

Suppose we want:

70

Instead of:

10 → 20 → 30 → 40 → 50 → 60 → 70

we can use the higher-level links.

For example:

10 ─────→ 40 ─────→ 70
                     ↑
                  found!

The search can jump forward rather than visiting every element.

This gives expected O(log n) search complexity. */