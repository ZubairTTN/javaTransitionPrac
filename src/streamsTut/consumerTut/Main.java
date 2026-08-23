package streamsTut.consumerTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* Consumer takes something and consumes/uses it, but does not return anything. */
public class Main {
    public static void main(String[] args) {
        Consumer<String> printName = name -> System.out.println(name);
        printName.accept("Mohd Zubair Ahmed");

//        Consumer using Anonymous Inner Class
        Consumer<Integer> printNumber = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        printNumber.accept(24);

        List<Integer> list = Arrays.asList(1, 5, 3, 7, 8);
        Consumer<List<Integer>> printList = x -> {
            for (Integer num: x)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        };
        printList.accept(list);
    }
}
