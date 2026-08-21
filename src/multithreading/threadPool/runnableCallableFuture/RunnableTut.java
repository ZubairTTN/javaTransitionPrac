package multithreading.threadPool.runnableCallableFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Runnable is used when your task does something but doesn't need to return a value.
public class RunnableTut {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task = () -> System.out.println("Processing Order On: " + Thread.currentThread().getName());

        executor.submit(task);
        executor.shutdown();
    }
}
