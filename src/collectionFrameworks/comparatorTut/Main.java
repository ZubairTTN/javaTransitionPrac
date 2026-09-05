package collectionFrameworks.comparatorTut;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* Comparator is an interface in Java used to define custom sorting logic for objects. */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(50, 10, 30, 20, 25);
//        Collections.sort(numbers);
//        numbers.sort(null);
        System.out.println(numbers);

        numbers.sort((o1, o2) -> o2 - o1);
        System.out.println("Descending Order: " + numbers);




        List<String> words = Arrays.asList("cherry", "date", "apple", "banana");
        words.sort(
                (o1, o2) -> o2.length() - o1.length()
        );
        System.out.println(words);
        
    }
}



//Comparator is a Functional Interface
class StringLengthComparator implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length(); // this will sort as per the String length and in descending order
    }
}

class DescendingComparator implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2)
    {
        return o2 - o1;
    }
}
