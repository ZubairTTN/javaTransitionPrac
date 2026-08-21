package multithreading.volatileAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileCounter {
    private AtomicInteger counter = new AtomicInteger(0); /* An Atomic class in Java is a class from java.util.concurrent.atomic that allows you to perform certain operations on shared variables safely between multiple threads without using synchronized or explicit locks. */
    public void increment()
    {
        counter.incrementAndGet();
    }

    public int getCounter()
    {
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileCounter vc = new VolatileCounter();
        Thread t1 = new Thread(
                () -> {
                    for(int i=1; i<=1000; i++)
                    {
                        vc.increment();
                    }
                }
        );

        Thread t2 = new Thread(
                () ->{
                    for(int i=1; i<=1000; i++)
                    {
                        vc.increment();
                    }
                }
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(vc.getCounter());
    }
}
