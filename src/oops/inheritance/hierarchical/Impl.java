package oops.inheritance.hierarchical;
/* One parent has multiple child classes.
*         Animal
         /      \
        ↓        ↓
      Dog       Cat*/
public class Impl {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("Bob");
        d.setAge(2);
        d.makeSound();

        Cat c = new Cat();
        c.setName("Coco");
        c.setAge(2);
        c.makeSound();
    }
}
