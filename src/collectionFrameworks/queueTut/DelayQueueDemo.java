package collectionFrameworks.queueTut;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedTask> queue = new DelayQueue<>();

        // Add tasks with different delays
        queue.put(new DelayedTask("Task 3 (Long delay)", 3000)); // 3 seconds
        queue.put(new DelayedTask("Task 1 (Short delay)", 1000)); // 1 second
        queue.put(new DelayedTask("Task 2 (Medium delay)", 2000)); // 2 seconds

        System.out.println("Queue started. Waiting for tasks to expire...\n");

        // Take elements out as they become ready
        while (!queue.isEmpty()) {
            // take() blocks until the next item's delay expires
            DelayedTask task = queue.take();
            System.out.println("Executed: " + task.getTaskName() + " at " + System.currentTimeMillis());
        }
    }

    /* What happens when you run this?
Even though you added "Task 3" first, the queue automatically reorganizes them by time. When you pull from the queue, Task 1 pops out first (after 1 second), followed by Task 2 (after 2 seconds), and finally Task 3 (after 3 seconds). */
}

// 1. Create a class that implements Delayed
class DelayedTask implements Delayed {
    private final String taskName;
    private final long startTime; // Epoch time when the task should execute

    public DelayedTask(String taskName, long delayInMilliseconds) {
        this.taskName = taskName;
        // Calculate future expiration time
        this.startTime = System.currentTimeMillis() + delayInMilliseconds;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remainingTime = startTime - System.currentTimeMillis();
        return unit.convert(remainingTime, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        return Long.compare(this.startTime, ((DelayedTask) other).startTime);
    }

    public String getTaskName() {
        return taskName;
    }
}


/* DelayQueue
This is one of the more specialized queues.
DelayQueue stores elements that become available only after their delay expires.
Think:

Current time: 10:00
Task A → available at 10:05
Task B → available at 10:02
Task C → available at 10:10

The consumer cannot take them before their delay expires.
At 10:02:
Task B
becomes available.

At 10:05:
Task A
becomes available.

Key Characteristics of a DelayQueue:
    Time-Based Expiration: Elements cannot be retrieved from the queue until their scheduled delay has passed.
    Blocking Retrieval: If you call take() and no elements have expired yet, your thread will block (freeze) until the next element's delay runs out.
    Unbounded Queue: You can keep adding items infinitely; it never gets "full" because capacity is managed by time, not fixed array sizes.
    Internal Priority Sorting: Under the hood, it uses a PriorityQueue to automatically keep the element with the soonest expiration time at the front of the line.*/