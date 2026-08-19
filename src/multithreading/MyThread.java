package multithreading;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING...");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState()); // NEW STATE

        t1.start(); /* here the main thread starts the t1 thread and then t1 thread runs independently as a separate thread */
        System.out.println(t1.getState()); // RUNNABLE STATE
//        System.out.println(Thread.currentThread().getName()); // main

        Thread.sleep(200); // here sleep() is a static method of the Thread class hence we are directly accessing te sleep() class using Thread class 
        System.out.println(t1.getState());
        t1.join(); // here main thread will wait for t1 thread to terminate
        System.out.println(t1.getState());


    }
}



/* MAIN THREAD                         t1 THREAD
───────────                         ─────────
Create t1

t1.start()
    │
    ├──────────────────────────────→ run()
    │                                     |
Continue main()                           |
    |                              "t1 Thread is running..."
    |                                     |
Thread.sleep(200)                         |
    |                                     ↓
main sleeps                          TERMINATED
    |
    ↓
Wake up
    |
Check t1.getState() */