package multithreading.daemonThread;

/* In Java, user threads and daemon threads are two types of threads based on their relationship with the JVM's lifetime.
The easiest way to remember them:
User thread = "Important work is still running."
Daemon thread = "Background/helper work." eg. JVM Garbage Collector */

public class MyThread extends Thread{
    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("Daemon is running...");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main Thread is Finished...");

    }
}

/* A daemon thread is generally used for background/supporting work. A daemon thread is not considered a reason for the JVM to remain alive.*/