package collectionFrameworks.queueTut;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueTut {
    public static void main(String[] args) {
        // Create the zero-capacity synchronous queue
        BlockingQueue<String> queue = new SynchronousQueue<>();

//        Producer Thread
        new Thread(() -> {
            try {
                System.out.println("Producer is waiting to hand over data...");
                queue.put("Hello from Producer!"); // Blocks until consumer takes it
                System.out.println("Data successfully handed off!");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        // Consumer Thread (started after a 2-second delay to show blocking)
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Consumer is ready to receive...");
                String data = queue.take(); // Blocks until producer gives it
                System.out.println("Consumer received: " + data);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }

    /* What happens when you run this?

    The Producer prints "Producer is waiting to hand over data..." and then freezes. It refuses to move forward.

    Two seconds pass.

    The Consumer prints "Consumer is ready to receive..." and calls take().

    Instantly, the hand-off happens, and both threads print their success messages. */
}

/* Imagine a relay race. Runner A is sprinting with the baton and cannot finish their leg until they directly hand that baton into the outstretched hand of Runner B. If Runner B isn't there yet, Runner A must freeze in place, holding the baton, until Runner B arrives.

That is exactly how a SynchronousQueue works in Java.
What is a SynchronousQueue?

A SynchronousQueue is a unique kind of blocking queue (java.util.concurrent.SynchronousQueue) with zero capacity.

Unlike a regular ArrayBlockingQueue or LinkedBlockingQueue, which act like a waiting room or storage shelf holding items until someone picks them up, a SynchronousQueue does not store anything at all.

    size() is always 0.

    You cannot add multiple items to it.

    An insert operation (put()) cannot succeed unless another thread is actively trying to remove an item (take()) at that exact moment.

How It Works: The Direct Hand-Off

Because it has no internal memory buffer, operations are strictly synchronized between two threads:

    The Producer (put()): When a thread tries to put an item into the queue, it blocks (freezes) until a consumer thread steps up to take it.

    The Consumer (take()): When a thread tries to take an item from the queue, it blocks until a producer thread steps up to give it one.

    The Meeting: The moment both threads meet, the item is handed directly from the producer to the consumer without ever touching a storage array.

    How It Works: The Direct Hand-Off

Because it has no internal memory buffer, operations are strictly synchronized between two threads:

    The Producer (put()): When a thread tries to put an item into the queue, it blocks (freezes) until a consumer thread steps up to take it.

    The Consumer (take()): When a thread tries to take an item from the queue, it blocks until a producer thread steps up to give it one.

    The Meeting: The moment both threads meet, the item is handed directly from the producer to the consumer without ever touching a storage array.*/