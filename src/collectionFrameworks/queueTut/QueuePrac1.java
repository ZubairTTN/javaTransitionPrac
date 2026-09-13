package collectionFrameworks.queueTut;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePrac1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12); // failure behavior: Throws exception
        queue.add(24); // adding elements into queue is known and enqueue
        queue.add(23);
        queue.add(81);
        queue.add(43);
        queue.offer(36); // failure behaviour: Returns false
        queue.remove(36); // failure behavior: Throws exception if empty, Note: removing elements from queue is known as dequeue
        queue.poll(); // failure behaviour: Returns null if empty
        System.out.println(queue.element()); // failure behavior: Throws exception if empty
        System.out.println(queue.peek()); // failure behavior: Returns null if empty

    }
}
