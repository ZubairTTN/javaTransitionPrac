package designPatterns.structuralDesignPattern.decoratorPattern;

/* Step 3: Create the abstract Decorator
This is the key piece — it implements the same interface AND holds a reference to a Coffee object that it wraps. */

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee; // the object being wrapped
    public CoffeeDecorator(Coffee coffee)
    {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription()
    {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost()
    {
        return decoratedCoffee.getCost();
    }
}
