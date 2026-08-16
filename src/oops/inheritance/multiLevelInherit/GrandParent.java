package oops.inheritance.multiLevelInherit;

public class GrandParent {
    private String name;
    private int age;
    private boolean hasSuperpower;

    public boolean hasSuperpower() {
        return hasSuperpower;
    }

//    Constructor
    public GrandParent(boolean hasSuperpower)
    {
        this.hasSuperpower = hasSuperpower;
        System.out.println("GrandParent Constructor Called. ");
    }

    public String getName()
    {
        return this.name;
    }
    
    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void eat()
        {
            System.out.println("Eating..");
        }
}
