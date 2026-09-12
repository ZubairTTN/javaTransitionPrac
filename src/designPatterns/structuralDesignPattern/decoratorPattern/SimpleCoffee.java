package designPatterns.structuralDesignPattern.decoratorPattern;

/* Step 2: Create the base/concrete component (the plain object) */

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
