package oops.inheritance.multiLevelInherit;

public class Child extends Parent{
    public Child(boolean hasSuperpower) {
        super(hasSuperpower); /* super() is used inside a child-class constructor to call the constructor of its immediate parent class. */
        System.out.println("Child Constructor is called ");
    }

    public void cry()
    {
        System.out.println("Crying...");
    }

}
