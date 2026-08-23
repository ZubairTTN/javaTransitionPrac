package streamsTut.functionTut;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/* Function, which is based on "take something → transform it into something else."
* @FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
* This means:
Function takes one input of type T and produces one output of type R.
* */
public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> num = number -> number * 2;
        System.out.println(num.apply(2));

        UnaryOperator<Integer> a = x -> 2*x; // here UnaryOperator is an interface that extends Function interface and here it helps in instead of writing two times integer that is any function that accepts and returns same data type values then instead of writing two times we can mention one time like here UnaryOperator<Integer>

        Function<String, Integer> getLength = name -> name.length();
        System.out.println(getLength.apply("Zubair"));

        Function<Integer, Integer> doubleIt = number -> number * 2;
        Function<Integer, Integer> tripleIt = number -> number * 3;
        Function<Integer, Integer> doubleItThenTripleIt = doubleIt.andThen(tripleIt);
        System.out.println(doubleItThenTripleIt.apply(20));

        System.out.println(Function.identity().apply(5)); // Identity is a static method which accepts and return same number.

//        using Anonymous Inner Class
        Function<Integer, String> noToString = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "Number is: " + integer;
            }
        };
        System.out.println(noToString.apply(12));
    }
}
