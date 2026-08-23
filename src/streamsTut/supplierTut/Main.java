package streamsTut.supplierTut;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* A Supplier is something that takes no input and gives you a value when you ask for it. */
public class Main {
    public static void main(String[] args) {
        Supplier<String> message = () -> "Hello Zubair";
        System.out.println(message.get());

//        Combined Example
        Predicate<Integer> predicate = x -> x%2==0;
        Function<Integer, Integer> function = x-> x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get()))
        {
            consumer.accept(function.apply(supplier.get()));
        }
    }
}
