package oops.polymorphism;
/*
* Polymorphism means one method can have many forms.
There are two types:
Compile-time polymorphism (Method Overloading)
Run-time polymorphism (Method Overriding) */

public class TestImpl {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound(); // Meoowwww....

        Animal dog = new Dog();
        dog.makeSound(); // Bark....

        Animal dog1 = new Animal();
        dog1.makeSound(); // Making Sound...
    }
}
