package multithreading.synchronizationTut;

/* Synchronization in Java is a mechanism that allows only one thread at a time to execute a critical section protected by the same lock, preventing race conditions and providing proper memory visibility.

* A race condition occurs when:
Multiple threads access shared data at the same time, and the final result depends on the timing/order in which the threads execute.
*

Note: Here Synchronisation provides Mutual Exclusion and Intrinsic Lock

Intrinsic lock = Java gives you the lock automatically.
Explicit lock = You explicitly create, acquire, and release the lock yourself.

Intrinsic Lock: These are built into every object in java. You don't see them, but they are there. When you use a synchronized keyword, you are using these automatic locks. */

public class Counter {
    private int count = 0;

//    Critical Section
    public void increment()
    {
        synchronized (this)
        {
            count++;
        }
    }
    public int getCount()
    {
        return count;
    }

}

class MyThread extends Thread{
    private Counter counter;
//    Constructor
    public MyThread(Counter counter)
    {
        this.counter = counter;
    }

    @Override
    public void run()
    {
        for(int i=1; i<=1000; i++)
        {
            counter.increment();
        }
    }
}

class Main{
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }
}
