package designPatterns.creationalDesignPatterns.builderPattern.singletonDesignPattern;


public class Main {
    public static void main(String[] args) {
        School s1 = School.getInstance();
        School s2 = School.getInstance();

        System.out.println(s1 == s2);
    }
}
