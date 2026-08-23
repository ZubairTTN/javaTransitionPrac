package streamsTut.functionalProgramming;

public class FunctProgrammEg {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        System.out.println(addition.calculate(2, 8));

        Calculator substraction = (a, b) -> a - b;
        System.out.println(substraction.calculate(12, 9));

        Calculator multiplication = (a, b) -> a * b;
        System.out.println(multiplication.calculate(5, 9));

        Calculator division = (a, b) -> a / b;
        System.out.println(division.calculate(4, 2));


    }



}
