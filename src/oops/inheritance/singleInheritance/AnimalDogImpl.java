package oops.inheritance.singleInheritance;
/* One child class inherits from one parent class. */
/* Animal
   ↑
   |
  Dog */
public class AnimalDogImpl {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeNoise();
        dog.setAge(12);
        dog.setName("Bob");
        System.out.println(dog.getName());
    }
}
