package streamsTut.streamsActualImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* A Stream in Java is a way to process a collection of data in a clean and functional style. */
public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Mohd", "Zubair", "Ahmed", "Chanda", "Sonu");

        names.stream().filter(name -> name.length() > 4).forEach(System.out::println);

        /* Find numbers greater than 30, double them, sort them and print them. */
        List<Integer> numbers = List.of(10, 25, 30, 45, 50, 60);
        numbers.stream().filter(x -> x > 30).map(x -> x*2).sorted().forEach(System.out::println);

        Integer[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.stream(arr).map(x -> x*2).forEach(System.out::println);

//        Creating Infinite Stream
        Stream.iterate(1, x -> x +1).limit(100).toList().forEach(System.out::println);

        Stream.generate(() -> 1).limit(20).forEach(System.out::println);

    }
}
