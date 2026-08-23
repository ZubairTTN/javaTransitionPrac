package streamsTut.streamsActualImpl.collectorsTut;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//collect is terminal operation and Collection is a Utility class
/* Collectors is a utility class provided by Java that gives us ready-made ways to collect the elements of a Stream into useful results. */
public class CollectorsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zubair", "Bob", "Akshat");
        List<String> result = names.stream().map(name -> name.toLowerCase()).filter(name -> name.startsWith("a")).collect(Collectors.toList());
        for (String name: result)
        {
            System.out.println(name);
        }
        result.forEach(System.out::println);

        List<Integer> nums = List.of(1, 2,3 ,4 ,5 , 6, 7, 8, 9, 12, 13, 14, 25, 4 ,5 , 6, 7, 12);
        for(Integer n: nums.stream().collect(Collectors.toSet()))
        {
            System.out.print(n + " "); // unique number
        }

    }
}
