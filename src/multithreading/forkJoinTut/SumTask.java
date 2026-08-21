package multithreading.forkJoinTut;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {

    private final int[] numbers;
    private final int start;
    private final int end;

    public SumTask(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= 10) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += numbers[i];
            }
            return sum;
        }

        int middle = (start + end) / 2;

        SumTask left = new SumTask(numbers, start, middle);
        SumTask right = new SumTask(numbers, middle, end);

        left.fork();
        right.fork();

        long leftResult = left.join();
        long rightResult = right.join();

        return leftResult + rightResult;
    }
}

class Main {
    public static void main(String[] args) {
        // 1. Fixed array size and naming
        int[] numbers = new int[100];

        // 2. Fixed loop bounds (0 to 99) and proper value assignment (1 to 100)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        ForkJoinPool pool = new ForkJoinPool();

        // 3. Passed the correct plural array variable
        SumTask task = new SumTask(numbers, 0, numbers.length);

        Long result = pool.invoke(task);
        System.out.println("Sum = " + result); // Should print 5050 for numbers 1 through 100

        pool.shutdown();
    }
}