package streamsTut.methodReference;

import java.util.function.Function;

/* The :: operator is called the method reference operator. */
public class Main {
    public static void main(String[] args) {
//        Using Lambda
        Function<String, String> function = x -> x.toUpperCase();
        System.out.println(function.apply("Zubair"));

//        Using Method Referencing
        Function<String, String> function1 = String::toUpperCase;
        System.out.println(function1.apply("Mohd Zubair Ahmed"));
    }
}
