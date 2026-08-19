package multithreading;

public class HelloWorld extends Thread{
    @Override
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("Hello World" + Thread.currentThread().getName());
        }
    }
}

class ThreadImpl {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld(); // NEW STATE
        hello.start(); // RUNNABLE STATE
        /* Note: hello.run(); -> Calling run() directly does NOT create a new thread. It would simply execute run() like a normal method on the current thread.*/

        System.out.println(Thread.currentThread().getName());  // main thread
        System.out.println(hello.currentThread().getName());   // main thread
        System.out.println(hello.getName()); // this will give the name of the thread represented by hello object

    }
}
