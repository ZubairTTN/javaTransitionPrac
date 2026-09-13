package collectionFrameworks.queueTut;

/* BlockingQueue:
Normal queue:
Producer
   ↓
Queue
   ↓
Consumer

Suppose the consumer tries to take something when the queue is empty.
Normal queue:
queue.poll();
returns:
null

But sometimes we don't want that.
We want:
"Wait until an element becomes available."
That's what BlockingQueue provides.

Producer-Consumer Model
Imagine a food delivery system.
             BlockingQueue
         ┌─────────────────-─┐
Producer │ Order 1           │ Consumer
   ────→ │ Order 2           │ ────→
         │ Order 3           │
         └─────────────────-─┘*/


import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTut {
    public static void main(String[] args) throws InterruptedException {
//        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4); // 4 means maximum capacity = 4
//        queue.add(12); //  → exception if full
//        queue.offer(23); // → false if full
//        queue.offer(42, 2, TimeUnit.SECONDS); // There are also timed versions:
//        queue.offer(62);
//        queue.offer(18);
//        queue.put(24); // → waits if full
//        System.out.println(queue);
//        queue.remove(); // → exception if empty
//        queue.poll(); // → null if empty
//        queue.poll(3, TimeUnit.SECONDS); // There are also timed versions:
//        queue.take(); // → waits if empty
//        System.out.println(queue);

//        Note: ArrayBlockingQueue is size bounded
        BlockingQueue<Integer> queue =
                new ArrayBlockingQueue<>(2);

        Thread producer = new Thread(() -> {

            try {

                queue.put(10);
                System.out.println("Produced 10");

                queue.put(20);
                System.out.println("Produced 20");

                queue.put(30);
                System.out.println("Produced 30");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {

            try {

                Thread.sleep(2000);

                System.out.println(
                        "Consumed " + queue.take()
                );

                System.out.println(
                        "Consumed " + queue.take()
                );

                System.out.println(
                        "Consumed " + queue.take()
                );

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

    }
}


/* LinkedBlockingQueue
* LinkedBlockingQueue is another BlockingQueue.

BlockingQueue<Integer> queue =
        new LinkedBlockingQueue<>();

It is based on linked nodes.
Unlike ArrayBlockingQueue, its capacity can be optionally bounded.
new LinkedBlockingQueue<>();
means effectively a very large capacity.
You can specify a capacity:
new LinkedBlockingQueue<>(100);
Now:
maximum = 100
* */
