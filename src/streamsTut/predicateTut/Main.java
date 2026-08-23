package streamsTut.predicateTut;
/* A Predicate is a functional interface used when you want to test something and get either true or false.
* Predicate = a condition/check that returns boolean. */

import java.util.List;
import java.util.function.Predicate;
/* Predicate is a Functional Interface... */
public class   Main {
    public static void main(String[] args) {
        /* implementing functional interface Predicate using Lambda expression */
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(5));

        /* implementing functional interface Predicate using Anonymous Inner Class */
        Predicate<Integer> isAdult = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 18;
            }
        };
        System.out.println(isAdult.test(41));

        /* Predicate with our own class */
        Employee e1 = new Employee("Zubair", 60000);
        Predicate<Employee> highSalary = employee -> employee.salary > 50000;
        System.out.println(highSalary.test(e1));

        /* Predicate with List */
        List<Integer> numbers = List.of(12, 43, 25, 63, 87, 32, 76);
        Predicate<Integer> isOdd = number -> number % 2 != 0;
        for (Integer number: numbers)
        {
            if(isOdd.test(number))
            {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        Predicate<String> isStartsWithA = name -> name.toLowerCase().startsWith("a");

        Predicate<String> isEndsWithA = name -> name.toLowerCase().endsWith("a");

        Predicate<String> startsAndEndsWithA = isEndsWithA.and(isEndsWithA);
        System.out.println(startsAndEndsWithA.test("Zubair"));
        System.out.println(startsAndEndsWithA.test("Akira"));

    }
}

class Employee{
    int salary;
    String name;

    public Employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }
}