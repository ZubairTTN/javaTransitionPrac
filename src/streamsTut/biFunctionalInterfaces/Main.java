package streamsTut.biFunctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        /* BiPredicate takes two inputs and returns boolean. */
        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x+y) % 2==0;
        System.out.println(isSumEven.test(23, 25));

        /* BiFunction = Take two values and transform them into one result. here taking two integers as inout and transforming it into an integer output */
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(23, 27));

        BinaryOperator<Integer> sumOf2No = (x, y) -> x + y;
        System.out.println(sumOf2No.apply(2, 6));

        BiConsumer<String, Integer> printEmployee = (name, salary) -> System.out.println(name + " earns " + salary);
        printEmployee.accept("Zubair", 210000);
    }
}
