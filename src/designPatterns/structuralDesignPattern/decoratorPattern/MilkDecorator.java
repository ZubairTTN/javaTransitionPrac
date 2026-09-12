package designPatterns.structuralDesignPattern.decoratorPattern;

/* Step 4: Create concrete decorators (the actual add-ons)
Each one wraps a Coffee, calls the wrapped object's methods, and adds its own bit on top. */

class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee)
    {
        super(coffee);
    }

    @Override
    public String getDescription()
    {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost()
    {
        return decoratedCoffee.getCost() + 10.0;
    }
}

class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription()
    {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost()
    {
        return decoratedCoffee.getCost() + 5.0;
    }
}

class WhipCreamDecorator extends CoffeeDecorator{
    public WhipCreamDecorator(Coffee coffee)
    {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 15.0;
    }
}