package multithreading.multithreadingPracticeImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class Task implements Callable<String>{
    private final String taskName;
    private final int executionTime;

    //    Constructor
    public Task(String taskName, int executionTime){
        this.taskName = taskName;
        this.executionTime = executionTime;
    }

    @Override
    public String call() throws Exception{
        System.out.println(Thread.currentThread().getName() + " started " + taskName );

        Thread.sleep(executionTime);
        return taskName + " Completed successfully";
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = List.of(
                new Task("Task-1", 2000),
                new Task("Task-2", 3000),
                new Task("Task-3", 1000),
                new Task("Task-4", 2500),
                new Task("Task-5", 1500)
        );

        CountDownLatch latch = new CountDownLatch(tasks.size());

        List<Future<String>> futures = new ArrayList<>();
        for(Callable<String> task: tasks)
        {
            Future<String> future = executor.submit(() ->{
                try{
                    return task.call();
                }
                finally {
                    latch.countDown();
                }
            });
            futures.add(future);
        }
        latch.await();
        System.out.println("All the tasks are completed ");
        for (Future<String> future: futures)
        {
            System.out.println(future.get());
        }
        executor.shutdown();
    }
}
