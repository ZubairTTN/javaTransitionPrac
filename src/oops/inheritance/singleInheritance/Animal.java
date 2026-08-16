package oops.inheritance.singleInheritance;

public class Animal {
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void makeNoise()
    {
        System.out.println("Making Noise....");
    }

}

class Dog extends Animal{
    /* This is Method overriding and is an example of run time polymorphism */
    @Override
    public void makeNoise()
    {
        System.out.println("Bark...");
    }

}
