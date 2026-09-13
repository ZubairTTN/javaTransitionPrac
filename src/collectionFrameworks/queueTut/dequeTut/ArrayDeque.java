package collectionFrameworks.queueTut.dequeTut;

/* Dequeue means double-ended Queue, and allows operations at both ends
*              Deque

     addFirst
        ↓
       [10][20][30]
                 ↑
               addLast

       ↑          ↑
   removeFirst  removeLast*/

import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new java.util.ArrayDeque<>();
        deque.addFirst(20);
        deque.addFirst(10);
        deque.addLast(30);
        deque.addLast(40);
        deque.addFirst(20);
        deque.addFirst(10);
        deque.addLast(30);
        deque.addLast(40);
        deque.removeFirst();
        deque.removeLast();
        deque.pollFirst();
        deque.pollLast();
        deque.peekFirst();
        deque.peekLast();
        System.out.println(deque);
    }

}

/* | First end       | Last end       |
| --------------- | -------------- |
| `addFirst()`    | `addLast()`    |
| `offerFirst()`  | `offerLast()`  |
| `removeFirst()` | `removeLast()` |
| `pollFirst()`   | `pollLast()`   |
| `getFirst()`    | `getLast()`    |
| `peekFirst()`   | `peekLast()`   |
 */