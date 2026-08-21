package multithreading.threadPool.executorframework;

import java.util.Scanner;
import java.util.concurrent.*;

public class ExecutorFactorial {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        System.out.println("Enter the no of which factorial is required: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        executor.submit(() -> {
            System.out.println("Factorial of " + n + " is " + factorial(n));
        });

        sc.close();
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static long factorial(long n) {
//        base condition
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
