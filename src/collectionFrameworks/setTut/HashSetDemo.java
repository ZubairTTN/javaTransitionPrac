package collectionFrameworks.setTut;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* A Set(interface) is a collection that stores unique elements.
                    Set Hierarchy
*                     Collection
                        |
                        |
                       Set
                        |
          +-------------+-------------+
          |             |             |
      HashSet      LinkedHashSet    SortedSet
                                      |
                                      |
                                 NavigableSet
                                      |
                                      |
                                    TreeSet*/
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(10); // this returns boolean value
        System.out.println(nums.add(43));
        System.out.println(nums.add(10));
        nums.add(10);
        nums.add(30);
        nums.add(20);
        nums.add(30);
        nums.add(20);
        System.out.println(nums);
        System.out.println(nums.remove(20));
        System.out.println(nums.remove(20));
        System.out.println(nums.contains(10));
        System.out.println(nums);
        System.out.println("nums Set size is: " + nums.size());
        System.out.println(nums.isEmpty());

//        Iterate
        for(Integer num: nums)
        {
            System.out.println(num);
        }

        nums.forEach(num -> System.out.print(num + " "));
        System.out.println();
        nums.forEach(System.out::print);
        Collections.synchronizedSet(nums); // using this, we can make any set synchronized, not recommended
    }
}

/* HashSet
    ↓
Fast + Unique

LinkedHashSet
    ↓
Fast + Unique + Insertion Order

TreeSet
    ↓
Unique + Sorted

EnumSet
    ↓
Unique enum values

ConcurrentSkipListSet
    ↓
Thread-safe + Sorted

CopyOnWriteArraySet
    ↓
Thread-safe + Read-heavy workloads */