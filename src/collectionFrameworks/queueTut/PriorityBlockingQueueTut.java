package collectionFrameworks.queueTut;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueTut {
    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<Integer> queue =
                new PriorityBlockingQueue<>();

        queue.put(50);
        queue.put(10);
        queue.put(30);

        System.out.println(queue.take());
        /* Output:
        10
        Then:
        queue.take();
        returns:
        30
        Then:
        50 */
    }
}

/* Important PriorityBlockingQueue detail

Unlike ArrayBlockingQueue, it is not normally bounded.

Therefore:

queue.put(...)

usually doesn't wait because the queue is full.

It grows as needed, subject to memory.

The blocking behavior primarily matters when taking from an empty queue.

queue.take();

waits until an element exists. */
