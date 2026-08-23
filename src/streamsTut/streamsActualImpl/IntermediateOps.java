package streamsTut.streamsActualImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        List<String> names = List.of("Mohd", "Zubair", "Ahmed", "Chanda", "Akshat", "Akshita", "Zubair", "Chanda", "Akshat");

//        filter
        for (String a : names.stream().filter(name -> name.toLowerCase().startsWith("a")).toList()) {
            System.out.println(a);
        }
//        map
//        using Method reference
        names.stream().map(String::toUpperCase).forEach(System.out::println);

//        Using Lambda expression
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);

//        distinct
        Stream<String> filteredNames = names.stream().distinct().map(name -> name.toUpperCase()).sorted();
        filteredNames.forEach(System.out::println);

//        limit
        Stream.iterate(1, x-> x+1).limit(50).forEach(System.out::println);

//        Skip
        Stream.iterate(1, x-> x+2).skip(5).limit(20).forEach(System.out::println);

//        flatMap() flatMap() is used when each element produces another collection/Stream, and you want to combine ("flatten") all those smaller Streams into one Stream.

        List<List<String>> namesMatrix = List.of(
                List.of("Mohd", "Zubair", "Ahmed"),
                List.of("John", "Alex"),
                List.of("Mike", "David", "Paul")
        );
        /* [
    [Zubair, Ahmed],
    [John, Alex],
    [Mike, David]
] */
        List<String> result = namesMatrix.stream().flatMap(list -> list.stream()).toList();

        System.out.println(result); /* [Mohd, Zubair, Ahmed, John, Alex, Mike, David, Paul] */

//        peek
        long nums = Stream.iterate(1, x-> x+1).skip(10).limit(100).peek(System.out::println).count();
        System.out.println(nums);

        List<String> uppercaseNames = namesMatrix.stream().flatMap(list -> list.stream().map(String::toUpperCase)).toList();
        System.out.println("UpperCase FlatMap is: " + uppercaseNames);

        List<String> sentences = Arrays.asList(
                "Hello Zubiar",
                "Java streams are powerfull",
                "flatMap is useful"
        );
        System.out.println(sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" ")).map(String::toUpperCase)).toList());
    }
}
