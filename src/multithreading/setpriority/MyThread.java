package multithreading.setpriority;

public class MyThread extends Thread{
    public MyThread(String name)
    {
        super(name);
    }
    @Override
    public synchronized void run()
    {
        for(int i=1; i<=1000; i++)
        {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
            try{
                Thread.sleep(200);
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MyThread max = new MyThread("Max Priority");
        MyThread mid = new MyThread("Mid Priority");
        MyThread low = new MyThread("Low Priority");

        /* Thread priority is a scheduling hint, not a guarantee. */
        max.setPriority(Thread.MAX_PRIORITY);
        mid.setPriority(Thread.NORM_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);


        max.start();
        mid.start();
        low.start();

        max.interrupt(); /* here, what interrupt method do is it makes the main thread interrupt the max thread that if max thread is in sleep/wait interrupt it. Now the main thread wants to tell t1:
        "Hey t1, I want you to stop waiting/doing your current interruptible operation and handle an interruption."
*/
    }
}
