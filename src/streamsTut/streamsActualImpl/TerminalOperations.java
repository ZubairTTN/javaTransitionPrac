package streamsTut.streamsActualImpl;

import com.sun.source.tree.UsesTree;

import java.util.*;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7 ,8);

//        toList
        List<Integer> newList = list.stream().map(x -> x*3).toList();
        for (Integer num: newList)
        {
            System.out.println(num);
        }

        for (Integer num: list.stream().map(x -> x*2).toList())
        {
            System.out.println(num);
        }

//        forEach
        Stream.iterate(1, x-> x+1).limit(30).forEach(System.out::println);

        System.out.println("\n\n\n");
//        reduce: Combines elements to produce single result
        Optional<Integer> newReducedList = list.stream().reduce((x, y) -> x + y);
        newReducedList.ifPresent(System.out::println);
        System.out.println(newReducedList.get());

//        count
//        anyMatch, allMatch, noneMatch - Predicate and resturn boolean
        System.out.println(list.stream().anyMatch(x -> x%2 ==0));
        System.out.println(list.stream().allMatch(x -> x%2 ==0));
        System.out.println(list.stream().noneMatch(x -> x%2==0));

//        findFirst findAny
        System.out.println(list.stream().map(x -> x*2).findFirst().get());
        System.out.println(list.stream().findAny().get());

//        Eg. Summing Values
        List<Integer> arrnum = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(arrnum.stream().reduce((x, y) -> x+y).get());

//        Eg. Counting Occurances of l Character
        String sentence = "Hello Zubair";
        System.out.println(sentence.chars().filter(x -> x == 'l').count());

//        StateFull: sorted(), distict() and StateLess Operations: map(), findAny()......

//        toArray() helps to convert the streams into an array and terminate
//        min/max
        System.out.println(Stream.of(2, 34, 54, 12, 671, 46).max(Comparator.naturalOrder()).get());




    }
}
