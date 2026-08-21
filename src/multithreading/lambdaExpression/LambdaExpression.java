package multithreading.lambdaExpression;
/* A functional interface is an interface that contains exactly one abstract method.

* Can a Functional Interface have more than one method?
This is where beginners often get confused.
The answer is:
Yes, it can have more than one method, but only ONE can be abstract.
For example,
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
    default void print() {
        System.out.println("Calculator");
    }
    static void info() {
        System.out.println("This is Calculator");
    }
}
Notes: https://chatgpt.com/share/6a873e16-00c8-83e8-bed9-a1a15d415644 */

public class LambdaExpression {
    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("hello World"); // Anonymous Function
        Thread t1 = new Thread(task1);
        t1.start();

        Thread t2 = new Thread(() -> System.out.println("Hello Zubair"));
        t2.start();
    }
}
