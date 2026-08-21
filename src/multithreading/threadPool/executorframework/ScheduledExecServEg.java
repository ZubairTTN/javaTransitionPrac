package multithreading.threadPool.executorframework;

import java.util.concurrent.*;
/* ScheduledExecutorService is a special type of ExecutorService that allows you to schedule tasks to run after a delay or repeatedly at fixed intervals.

* schedule()
        → Run ONCE after a delay

scheduleAtFixedRate()
        → Run REPEATEDLY at a fixed rate

scheduleWithFixedDelay()
        → Run repeatedly, waiting for the previous execution
          to finish + specified delay
          *

    schedule()
        ↓
Runnable OR Callable
        ↓
Runs ONCE


scheduleAtFixedRate()
        ↓
Runnable ONLY
        ↓
Runs repeatedly


scheduleWithFixedDelay()
        ↓
Runnable ONLY
        ↓
Runs repeatedly   */

public class ScheduledExecServEg {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        Callable<Integer> callable = () ->{
            System.out.println("Task is in Process... Printed after 5 sec..." + Thread.currentThread().getName());
            return 300;
        };

        Runnable runnable = () -> System.out.println("Hello Zubair, This Task is executed at every 5 seconds.  ");

        ScheduledFuture<Integer> future = scheduler.schedule(callable, 5, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(runnable,
                2,
                5,
                TimeUnit.MILLISECONDS); /* you cannot pass a Callable to scheduleAtFixedRate() */

        scheduler.scheduleWithFixedDelay(runnable, 2, 5, TimeUnit.SECONDS);

        scheduler.schedule(() -> {
            System.out.println("Initiating Shutdown...");
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS); // this shutdown will be triggered after a delay of 10 seconds.
//        Integer scheduledResult = future.get(2, TimeUnit.SECONDS);
//        System.out.println("Scheduled Result is: " + scheduledResult);
        System.out.println(scheduler.isShutdown());
        System.out.println(scheduler.isTerminated());

    }
}
