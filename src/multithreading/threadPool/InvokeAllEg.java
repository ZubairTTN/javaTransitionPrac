package multithreading.threadPool;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllEg {
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newFixedThreadPool(1);

        List<Callable<Integer>> callableList = List.of(
                () -> {
                    System.out.println("Task 1: " + Thread.currentThread().getName());
                    return 200;
                },

                () -> {
                    System.out.println("Task 2: " + Thread.currentThread().getName());
                    return 300;
                },

                () -> {
                    System.out.println("Task 3: " + Thread.currentThread().getName());
                    return 400;
                }
        );


            List<Future<Integer>> futureList = executor.invokeAll(callableList);
            /* invokeAll() waits until all submitted tasks have completed before returning the List<Future<Integer>>
            * invokeAll() makes the thread that calls it wait until all the submitted tasks complete.(Usually, if you call it from main(), that means the main thread waits.) */

        for(Future<Integer> future: futureList)
        {
            System.out.println("Results: " + future.get());
        }

        Integer invokeAnyResult = executor.invokeAny(callableList); /* invokeAny() takes multiple Callable tasks, runs them through the ExecutorService, and returns the result of the first task that successfully completes. The remaining unfinished tasks are cancelled by invokeAny().*/
        System.out.println("InvokeAny Result is: " + invokeAnyResult);
        executor.shutdown();
    }
}
