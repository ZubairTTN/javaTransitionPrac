package multithreading.reentrantLock;
/*  */
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance;

    public BankAccount(int balance)
    {
        this.balance = balance;
    }

    private final Lock lock = new ReentrantLock(); /* Lock is an interface and ReentrantLock is the implementation class */

    public void withDraw(int amount)
    {
        System.out.println(Thread.currentThread().getName() + " attempting to Withdraw " + amount);

        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS))
            {
                try {
                    if (balance >= amount) {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed withdrawal. Remaining balance: " + balance);
                    }
                    else{
                        System.out.println(Thread.currentThread().getName() + " insufficient balance...");
                    }
                }
                finally {
                    lock.unlock();
                }
            }
            else {
                System.out.println(Thread.currentThread().getName() + " Could not acquire the lock will try again later ");
            }
        }
        catch (Exception e)
        {
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + " was interrupted...");
        }
    }
}

class MainBank{
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount(3000);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withDraw(100);
            }
        };

        Thread t1 = new Thread(task, " Thread 1 ");
        Thread t2 = new Thread(task, " Thread 2 ");
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + " got interrupted with reason: " + e.getMessage());
        }
    }
}
