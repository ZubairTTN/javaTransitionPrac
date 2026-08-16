package oops.polymorphism;
/*
* Polymorphism means one method can have many forms.
There are two types:
Compile-time polymorphism (Method Overloading)
Run-time polymorphism (Method Overriding) */

/* Dynamic Method Dispatch means:
When a parent-class reference points to a child-class object, Java decides at runtime which overridden method to execute based on the actual object, not the reference type. */

public class MethodOverridingImpl {
    public static void main(String[] args) {
        Animal cat = new Cat(); // Upcasting/ Dynamic Method Dispatch
        cat.makeSound(); // Meoowwww....

//        cat.eat(); // here we cannot do cat.eat() even the eat method is defined inside the Cat class this is due to cat is an Animal type reference and Animal does not know that eat method exists. Even though the actual object is a Cat and Cat has an eat() method, the compiler only allows methods available through the reference type. to run cat.eat() we have to downcast the cat object.
        Cat catNew = (Cat) cat; // this is downcasting and now we can run catNew.eat()
        catNew.eat();


        Animal dog = new Dog();
        dog.makeSound(); // Bark....

        Animal dog1 = new Animal();
        dog1.makeSound(); // Making Sound...
    }
}
