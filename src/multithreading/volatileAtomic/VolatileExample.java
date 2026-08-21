package multithreading.volatileAtomic;

import multithreading.MyThread;

/* In Java, volatile is a keyword used with variables to ensure visibility of changes across multiple threads. It tells the Java Virtual Machine (JVM) that a variable's value may be modified by different threads, so it should always read the latest value from main memory instead of using a cached copy. */

class SharedResource{
    private volatile boolean flag = false;
    public void setFlagTrue()
    {
        System.out.println("writerThread made the flag value True...");
        flag = true;
    }

    public void printIfFlagTrue()
    {
        while(!flag)
        {
            System.out.println("Flag is False...");
        }
        System.out.println("Flag is True...");
    }
}

//class WriterThread extends Thread{
//    private SharedResource resource;
////    Constructor
//    public WriterThread(SharedResource resource)
//    {
//        this.resource = resource;
//    }
//    @Override
//    public void run()
//    {
//        resource.setFlagTrue();
//    }
//}
//
//class ReaderThread extends Thread{
//    private SharedResource resource;
//    public ReaderThread(SharedResource resource)
//    {
//        this.resource = resource;
//    }
//    @Override
//    public void run()
//    {
//        resource.printIfFlagTrue();
//    }
//}

public class VolatileExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread writerThread = new Thread(
                () -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    resource.setFlagTrue();
                }
        );

        Thread readerThread = new Thread(
                () ->{
                    resource.printIfFlagTrue();
                }
        );

        writerThread.start();
        readerThread.start();
//        WriterThread wt = new WriterThread(resource);
//        wt.start();
//        ReaderThread rt = new ReaderThread(resource);
//        rt.start();
    }

}


