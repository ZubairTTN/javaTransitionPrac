package oops.abstraction;
/* Abstraction means hiding unnecessary implementation details and exposing only what is necessary.
* In Java, abstraction is mainly achieved using:
1. Abstract classes
2. Interfaces */

/* * Abstract class can contain normal methods
        This is one of the biggest differences between an abstract class and an interface.
        An abstract class can have:
        Abstract methods
        Concrete methods
        Variables
        Constructors
        Static methods
        Final methods */

public abstract class Animal {
    public abstract void makeSound();
//    Constructor, Note: An Abstract class can have a constructor, but an interface cannot have a constructor
    protected Animal(){
        System.out.println("Constructor Called");
    }

    public void eat()
    {
        chewFood();
    }

    private void chewFood() // an abstract class can have private methods/Fields known as internal helper methods/Fields
    {
        System.out.println("Eating Food.");
    }

    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
