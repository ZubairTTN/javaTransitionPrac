package collectionFrameworks.queueTut;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueTut {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // Producer Thread 1: Adding items
        Thread producer1 = new Thread(() -> {
            queue.offer("Apple");
            queue.offer("Banana");
            System.out.println("Producer 1 added items.");
        });

        // Producer Thread 2: Adding items concurrently
        Thread producer2 = new Thread(() -> {
            queue.offer("Cherry");
            queue.offer("Date");
            System.out.println("Producer 2 added items.");
        });

        producer1.start();
        producer2.start();

        // Wait for producers to finish
        producer1.join();
        producer2.join();

        // Consumer Thread: Polling items safely
        Thread consumer = new Thread(() -> {
            String item;
            while ((item = queue.poll()) != null) {
                System.out.println("Consumed: " + item);
            }
        });

        consumer.start();
        consumer.join();
    }
}


/* Imagine a high-speed ticket counter line where there is no security guard locking the door or blocking people. Instead, everyone in line uses a clever digital token system to manage their spots instantly. If two people try to step into the exact same spot at the exact same microsecond, one immediately notices, steps back, and takes the next spot—no waiting, no pausing, and no locks.

That is the essence of a ConcurrentLinkedQueue (java.util.concurrent.ConcurrentLinkedQueue).
What is a ConcurrentLinkedQueue?

It is a thread-safe, unbounded, First-In-First-Out (FIFO) queue built out of linked nodes.

Unlike traditional thread-safe collections (like Vector or SynchronizedList) that use heavy locks (making threads wait in line for their turn), ConcurrentLinkedQueue uses lock-free, non-blocking algorithms powered by atomic operations (specifically CAS - Compare-And-Swap).
Key Characteristics

    Lock-Free & High Performance: Multiple threads can read, write, and remove elements simultaneously without putting each other to sleep. This makes it blazing fast in high-concurrency environments (like multi-threaded web servers processing web requests).

    Unbounded: It has no fixed capacity limit. It will keep growing as long as your system has memory.

    Weakly Consistent Iterators: If you loop through the queue while other threads are modifying it, the iterator won't throw a ConcurrentModificationException. It simply reflects whatever data is there at that moment.

    The size() Trap: Because it doesn't use locks, counting every single item requires walking through the entire linked list. Calling size() is an O(N) operation, so you should avoid calling it frequently in performance-critical code loops. */