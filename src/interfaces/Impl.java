package interfaces;

public class Impl {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal dog2 = new Dog();
        System.out.println(Animal.MAX_AGE); // accessing static constant using interface Animal
        System.out.println(dog.MAX_AGE); // accessing static constant using object of implemented class Dog
        System.out.println(Dog.MAX_AGE); // accessing static constant using implemented class Dog.
        Animal.info();
        // we cannot do Dog.info() or dog.info() instead we can only access info() through interface i.e Animal.info()

        dog.run(); // here we can call the interface default method using implemented class objects

        dog2.eat();
        dog.eat();
        dog.sleep();

        Cow cow = new Cow();
        cow.eat();
        cow.sleep();
        cow.run();

        Animal.main(args);
    }
}
