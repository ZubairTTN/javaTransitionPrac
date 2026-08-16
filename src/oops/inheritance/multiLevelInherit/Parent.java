package oops.inheritance.multiLevelInherit;

public class Parent extends GrandParent{
    public Parent(boolean hasSuperpower) {
        super(hasSuperpower); /* super() is used inside a child-class constructor to call the constructor of its immediate parent class. that is why super is not mentioned in Grandparent Constructor */
        System.out.println("Parent Constructor is called ");
    }

    public void speaks()
        {
            System.out.println("Speaking....");
        }
}
