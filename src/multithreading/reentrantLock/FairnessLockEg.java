package multithreading.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* n Java, fairness means:
When multiple threads are waiting for a lock, should the thread that has been waiting the longest get the lock first? */

public class FairnessLockEg {
    private final Lock lock = new ReentrantLock(true);

    public void accessResource()
    {
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " acquired the lock. ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally {
            System.out.println(Thread.currentThread().getName() + " release the lock. ");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLockEg eg = new FairnessLockEg();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                eg.accessResource();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
}
