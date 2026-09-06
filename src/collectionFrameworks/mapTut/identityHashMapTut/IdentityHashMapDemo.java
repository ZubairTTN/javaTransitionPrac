package collectionFrameworks.mapTut.identityHashMapTut;

import java.util.HashMap;
import java.util.IdentityHashMap;

/* HashMap compares keys using equals(), while IdentityHashMap compares keys using ==. */
public class IdentityHashMapDemo {
    public static void main(String[] args) {
//        first see how does a HashMap works -> it used .equals()
        HashMap<String, Integer> map = new HashMap<>();
        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        map.put(s1, 100);
        map.put(s2, 200);
        System.out.println("Size of hashMap" + map.size());
        System.out.println("HashMap: " + map);

        /* the hashMap will use s1.equals(s2) which will come true as they both have same value hence the the second put() replaces the value associated with the first key.
        So: System.out.println(map.size()); prints: 1  */

//        Working of Identity HashMap, uses == instead of .equals()
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
        String str1 = new String("Zubair");
        String str2 = new String("Zubair");
        identityHashMap.put(str1, 200);
        identityHashMap.put(str2, 400);
        System.out.println("Size of Identity HashMap: " + identityHashMap.size()); // this print 2 because str1 == str2 is false as it compares the reference address contained in str1 and str2, and as both have different reference value it gives false.
        System.out.println("Identity HashMap: " + identityHashMap);

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));


    }
}


/* First, remember what HashMap does
Suppose we have:

String s1 = new String("Java");
String s2 = new String("Java");

These are two different objects:
s1 ─────→ String Object 1 ("Java")
s2 ─────→ String Object 2 ("Java")

But:
System.out.println(s1 == s2);
prints:
false

because they are different objects.
However:
System.out.println(s1.equals(s2));
prints
true
because their contents are the same.

***************************************************************************************************************

What does HashMap care about?
HashMap uses:
hashCode()
   ↓
equals()

to determine whether two keys should be considered the same.
Example:
HashMap<String, Integer> map = new HashMap<>();

String s1 = new String("Java");
String s2 = new String("Java");

map.put(s1, 100);
map.put(s2, 200);
Since:
s1.equals(s2) == true

the second put() replaces the value associated with the first key.
So:
System.out.println(map.size());

prints:
1

Conceptually:
HashMap
"Java" → 200*/

