package multithreading.cyclicBarrierTut;

import java.util.concurrent.CyclicBarrier;

/* In Java, a CyclicBarrier is a synchronization utility from the java.util.concurrent package that allows a group of threads to wait for each other at a common barrier point before continuing execution.

It's called cyclic because the barrier can be reused multiple times after all threads reach it. */
public class CyclicBarrierEg {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All Threads reached the barrier. "));
        /* does not mean: "Create 3 threads."
        It means: "The barrier needs 3 parties/threads to call await() before it opens." */

        Runnable task = () -> {
        try {
            System.out.println(Thread.currentThread().getName() + " is working");

            Thread.sleep((long) (Math.random() * 3000));
            /* Math.random() generates a value between: 0.0 and 1.0
            Multiplying by 3000 gives approximately: 0 - 3000 milliseconds
            Then we convert it to long.
            So each thread sleeps for a random amount of time.
            For example,
            Thread-1 → sleeps 1000 ms
            Thread-2 → sleeps 2500 ms
            Thread-3 → sleeps 500 ms */

            System.out.println(Thread.currentThread().getName()
                    + " waiting at barrier");

            barrier.await(); /* means: "I have finished my current work. I am now waiting for the other threads." */

            System.out.println(Thread.currentThread().getName()
                    + " continues");

        } catch (Exception e) {
            e.printStackTrace();
        }
        };
        for(int i=1; i<=3; i++)
        {
            new Thread(task, "Thread-" + i).start();
        }
    }
}

/* CyclicBarrier makes multiple threads wait at a common point until all required threads reach that point, then allows them all to continue, and the barrier can be reused for another round. */