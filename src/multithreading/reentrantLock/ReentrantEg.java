package multithreading.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* .lock()
* .unlock()
* .tryLock() with and without time
* .lockInterruptibly() -> Try to acquire the lock, but if I'm waiting and another thread interrupts me, stop waiting and throw InterruptedException*/
public class ReentrantEg {
    private final Lock lock = new ReentrantLock();

    public void outerMethod()
    {
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " Outer Method");
            innerMethod();
        }
        finally {
            lock.unlock();
        }
    }

    public void innerMethod()
    {
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " Inner Method");
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantEg eg = new ReentrantEg();
        eg.outerMethod();
    }
}
