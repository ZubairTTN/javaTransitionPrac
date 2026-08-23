package streamsTut.streamsActualImpl.parallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class MutableStateParallelStreamEg {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.iterate(1, x -> x+1).limit(100).toList();
        List<Integer> result = new ArrayList<>();
        AtomicInteger sum = new AtomicInteger(0);
        result = numbers.parallelStream().map(x -> sum.addAndGet(x)).toList();

        System.out.println(result);

    }


}
