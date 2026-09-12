package collectionFrameworks.iteratorTut;

import java.util.ArrayList;
import java.util.Iterator;
/* Iterator is the standard mechanism used to traverse elements of a collection one by one. */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for(Integer i: list)
        {
            System.out.println(i);
        }

//        Internal working
        Iterator<Integer> iterator = list.iterator();
        /* here list.iterator means ArrayList give me an iterator that i can use to traverse your elements, and the result is an iterator object "iterator" and iterator is an Iterator capable of traversing Integer elements. */
        while (iterator.hasNext())
        {
            System.out.println(iterator.next()); /* next() means Move the Iterator to the next element and return that element. */
        }
    }
}

/* Think of an Iterator as a pointer/cursor that moves through the collection.

ArrayList

Index:    0     1     2     3
         ┌─────┬─────┬─────┬─────┐
         │ 10  │ 20  │ 30  │ 40  │
         └─────┴─────┴─────┴─────┘
           ↑
        Iterator

Iterator has 3 main methods
public interface Iterator<E> {

    boolean hasNext();

    E next();

    void remove();
}
| Method      | Purpose                                       |
| ----------- | --------------------------------------------- |
| `hasNext()` | Checks whether another element exists         |
| `next()`    | Returns the next element                      |
| `remove()`  | Removes the last element returned by Iterator |
*/