package streamsTut.streamsActualImpl.parallelStream;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamTut {

    public static void main(String[] args) {

        List<Integer> list =
                Stream.iterate(1, x -> x + 1)
                        .limit(20)
                        .toList();

        // ---------------- PARALLEL STREAM ----------------

        long parallelStartTime = System.currentTimeMillis();

        List<Long> parallelList =
                list.parallelStream()
                        .map(x -> factorial(x))
                        .toList();

        long parallelEndTime = System.currentTimeMillis();

        long parallelTime = parallelEndTime - parallelStartTime;


        // ---------------- NORMAL STREAM ----------------

        long normalStartTime = System.currentTimeMillis();

        List<Long> normalList =
                list.stream()
                        .map(x -> factorial(x))
                        .toList();

        long normalEndTime = System.currentTimeMillis();

        long normalTime = normalEndTime - normalStartTime;


        // ---------------- OUTPUT ----------------

        System.out.println("Parallel Stream Time: " + parallelTime + " ms");
        System.out.println("Parallel List: " + parallelList);

        System.out.println();

        System.out.println("Normal Stream Time: " + normalTime + " ms");
        System.out.println("Normal List: " + normalList);


        // ---------------- PARALLEL REDUCE ----------------

        List<Integer> list3 = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        int result =
                list3.parallelStream()
                        .reduce(0, (a, b) -> a + b);

        System.out.println();
        System.out.println("Parallel Reduce Result: " + result);
    }


    private static long factorial(int n) {

        // Base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}