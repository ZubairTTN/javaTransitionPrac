package collectionFrameworks.mapTut.concurrentHashMapTut;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* ConcurrentHashMap is a thread-safe implementation of the Map interface designed specifically for concurrent access by multiple threads.
* A Map that allows multiple threads to work with the map safely and efficiently at the same time.
Map - interface
 │
 └── ConcurrentMap - interface
       │
       └── ConcurrentHashMap - implemented class
uses CAS (Compare and Set) -> No locking except resizing or collision(lock on particular bucket and not complete map)
* Thread A last saw --> x = 45
* Thread A works --> x to 50
* if x is still 45, then change it to 50 else don't change and retyry
* put --> index
* CAS = Compare-And-Set
Conceptually:
Current value = A
"Change A → B
only if the current value is still A."
If another thread changed it first:
Current value ≠ A
→ operation fails
→ retry/recalculate
This allows certain operations to happen without using a traditional lock.*/
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(101, "Zubair");
        map.put(102, "Ahmed");
        map.put(103, "John");
        System.out.println(map.get(101));
    }
}

/* HashMap
   ↓
Fast but NOT thread-safe

Hashtable
   ↓
Thread-safe but old/coarse synchronization

ConcurrentHashMap
   ↓
Thread-safe + designed for high concurrency */