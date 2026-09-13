package collectionFrameworks.queueTut.dequeTut;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

/* ConcurrentLinkedDeque is designed for Concurrent access, multiple threads can safely operate on it, it is Thread Safe, Non Blocking, Double ended  */

public class ConcurrentLinkedDequeTut {
    public static void main(String[] args) {
        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        deque.addFirst(12);
        deque.offerFirst(13);
        deque.addLast(23);
        deque.offerLast(67);
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque.removeLast());
    }
}
