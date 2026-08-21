package multithreading.countDownLatch;
/* CountDownLatch is a synchronization tool that allows one or more threads to wait until a certain number of operations are completed.
The easiest way to understand it:
A CountDownLatch is like a countdown. A thread waits until the countdown reaches 0 */

import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        CountDownLatch latch = new CountDownLatch(3);

        executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            latch.countDown();
            return 200;
        });

        executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            latch.countDown();
            return 400;
        });

        executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            latch.countDown();
            return 600;
        });

        latch.await();
        System.out.println("All Task is Completed");
        executor.shutdown();


    }
}
