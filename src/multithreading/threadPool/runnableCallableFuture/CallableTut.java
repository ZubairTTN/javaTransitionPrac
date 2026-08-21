package multithreading.threadPool.runnableCallableFuture;

import java.util.concurrent.*;
/* Callable has call() method while Runnable has run() method */
public class CallableTut {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            System.out.println("Calculating order total on: " + Thread.currentThread().getName());
            Thread.sleep(2000);
            return 5000;
        };

        Callable callable = () -> 1;
        Callable<Integer> callable1 = () -> 2;
        Future<Integer> future = executor.submit(task);
        System.out.println("Task submitted");
        Integer result = future.get(5, TimeUnit.SECONDS);
        System.out.println("Result: " + result);
        executor.shutdown();
        System.out.println(executor.isShutdown());
        Thread.sleep(10);
        System.out.println(executor.isTerminated());


    }
}
