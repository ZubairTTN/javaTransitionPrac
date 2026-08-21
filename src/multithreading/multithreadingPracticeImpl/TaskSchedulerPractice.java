package multithreading.multithreadingPracticeImpl;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskSchedulerPractice {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        Runnable task1 = () -> {
            System.out.println(Thread.currentThread().getName() + " executed Task 1");
        };

        Runnable task2 = () -> {
            System.out.println(Thread.currentThread().getName() + " executed Task 2");
        };

        Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " executed Task 3");
        };

        // Execute once after 3 seconds
        scheduler.schedule(task1, 3, TimeUnit.SECONDS);

        // Start after 2 seconds, repeat every 2 seconds
        scheduler.scheduleAtFixedRate(task2, 2, 2, TimeUnit.SECONDS);

        // Start after 4 seconds, wait 5 seconds after
        // each execution before running again
        scheduler.scheduleWithFixedDelay(task3, 4, 5, TimeUnit.SECONDS);

        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        scheduler.shutdown();
    }
}
