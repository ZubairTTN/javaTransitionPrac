package multithreading;
/* Runnable interface is an example of Functional Interface as it only has abstract run() method */
public class HelloZubair implements Runnable{
    @Override
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("Hello Zubair " + Thread.currentThread().getName());
        }
    }
}

class RunnableImpl {
    public static void main(String[] args) {
        HelloZubair zubair = new HelloZubair();
        Thread t1 = new Thread(zubair);
        t1.start();
    }
}

/*                          Stack
                           |
                           |
             zubair ───────┐
                           |
             t1 ───────────┼───────────────┐
                           |               |
                           ↓               ↓
                         Heap            Heap
                    HelloZubair         Thread
                    ┌───────────┐      ┌─────────────┐
                    │ run()     │      │ target ─────┼───→ zubair
                    └───────────┘      └─────────────┘ */

/*                   main thread
                       |
                       |
                    t1.start()
                       |
                       ↓
                JVM / Thread system
                       |
                       ↓
                NEW THREAD CREATED
                       |
                       ↓
                  Thread.run()
                       |
                       ↓
                 target.run()
                       |
                       ↓
              HelloZubair.run() */


/* Conceptual implementation you should remember

For learning purposes :
class Thread implements Runnable {
    private Runnable target;
    public Thread(Runnable target) {
        this.target = target;
    }

    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }

    public void start() {
        // JVM/OS creates a new thread


        // New thread eventually executes:
        run();
    }
} */

/* There are actually three different things:

Runnable: CONTRACT
It says:
"I have a run() method representing some task."

HelloZubair: TASK IMPLEMENTATION
It says:
"Here's exactly what my task does."

Thread: EXECUTION MECHANISM
It says:
"I can execute that task on a separate thread."

So:
Runnable
   ↓
defines run()

HelloZubair
   ↓
implements run()
   ↓
defines the actual task

Thread
   ↓
receives HelloZubair
   ↓
stores it
   ↓
start()
   ↓
new execution thread
   ↓
executes run()*/