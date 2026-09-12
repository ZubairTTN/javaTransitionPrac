package designPatterns.creationalDesignPatterns.builderPattern.factoryPattern.prac;

/* Step 1: Create a common interface */
public interface Shape {
    public abstract void draw();
}
/* Step 2: Create concrete classes implementing that interface */
class Circle implements Shape{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Circle...");
    }
}
class Square implements Shape{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Square...");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Rectangle...");
    }
}

class Triangle implements Shape{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Triangle...");
    }
}
