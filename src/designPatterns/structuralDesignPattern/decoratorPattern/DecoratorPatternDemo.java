package designPatterns.structuralDesignPattern.decoratorPattern;

/* Client code — combine decorators however you like */

public class DecoratorPatternDemo {
    public static void main(String[] args) {

//        Plain Coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

//        Coffee with Milk
        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.getDescription() + " -> $" + milkCoffee.getCost());

//        Coffee with milk + sugar + whipped cream(wrapping layer by layer)
        Coffee fancyCoffee = new WhipCreamDecorator(new SugarDecorator(new MilkDecorator(new SimpleCoffee())));
        System.out.println(fancyCoffee.getDescription() + " -> $" + fancyCoffee.getCost());
    }
}

/* When you call fancyCoffee.getCost():

WhipCreamDecorator.getCost() runs → it calls decoratedCoffee.getCost() (which is the SugarDecorator) and adds 15.0 to whatever comes back.
That triggers SugarDecorator.getCost() → it calls decoratedCoffee.getCost() (the MilkDecorator) and adds 5.0.
That triggers MilkDecorator.getCost() → it calls decoratedCoffee.getCost() (the SimpleCoffee) and adds 10.0.
That triggers SimpleCoffee.getCost() → returns 50.0 (the base case, nothing left to delegate to).

Then the results bubble back up: 50.0 → +10 = 60.0 → +5 = 65.0 → +15 = 80.0.

Same exact chain happens for getDescription(), building up the string one layer at a time as it bubbles back up.

The key insight: every decorator does two things — it calls the method on the object it's wrapping (delegation), and then it adds its own little bit of extra behavior before/after that call. */
