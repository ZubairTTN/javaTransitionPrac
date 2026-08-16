package oops.abstraction;

public class AnimalImpl {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        cat.eat();
        cat.setName("Coco");
        System.out.println(cat.getName());

        Cow cow = new Cow();
        cow.makeSound();

        /* Animal animal = new Animal(); we cannot create object of abstract class */

    }
}
