package collectionFrameworks.queueTut;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue);
        System.out.println("Get me the element at index 1: " + queue.get(1));
    }

    /* Internal Working of LinkedList as Queue ->
    * LinkedList is a doubly linked list, where each node contains previous, Data and Next
    * when queue.offer(10) is used it adds at the end
    * when queue.poll() is used it removes from the beginning... so
    * Insertion → tail
      Removal → head*/
}
