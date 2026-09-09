package collectionFrameworks.mapTut.collectionsAlgos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionAlgos {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        Collections.sort(numbers);
        for(Integer num: numbers)
        {
            System.out.print(num + " ");
        }
//        Collections.sort(numbers, (a,b) -> b-a);
//        System.out.println(numbers);
        Comparator<Integer> comp = (a,b) -> b-a;
        System.out.println();
        System.out.println(Collections.binarySearch(numbers, 10));
    }
}
