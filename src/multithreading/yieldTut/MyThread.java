package multithreading.yieldTut;

public class MyThread extends Thread{
    @Override
    public void run()
    {
        for(int i=1; i<=100; i++)
        {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
            try{
                Thread.yield(); /* I've had a chance to run. If another thread wants CPU time, it can run now. */
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
