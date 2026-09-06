package collectionFrameworks.mapTut.LRUCacheTut;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;
    //    super(...) must be first statement in constructor
    public LRUCache(int capacity){
        super(capacity, 0.75f, true);   /* super refers to the parent class constructor.
         LRUCache → child class
         LinkedHashMap → parent class
         So super(...) calls the constructor of LinkedHashMap.*/
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest)
    {
        return size() > capacity;
        /* “If cache exceeds the maximum size, remove the oldest entry.” */
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Bob", 99);
        studentMap.put("Alice", 98);
        studentMap.put("Abdur", 97);
        studentMap.get("Bob");
        studentMap.put("Zubair", 100); // after insertion of Zubair, Bob will be removed as size capacity is 3 and after size increase than 3 the last or the eldest used value that is Bob will be removed.

        studentMap.get("Bob");
        System.out.println(studentMap);
    }

}
