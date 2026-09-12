package designPatterns.creationalDesignPatterns.builderPattern.builderPattern.prac;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Burger muttonBurger = new Burger.BurgerBuilder("Sesame Bun", "Mutton Smash Patty").addCheese().addLettuce().addOnion().addSauce().build();
        System.out.println(muttonBurger);

        // A different burger, with different options - super readable!
        Burger veggieLoverBurger = new Burger.BurgerBuilder("Wheat Bun", "Veggie Patty")
                .addLettuce()
                .addTomato()
                .addOnion()
                .build();

        System.out.println(veggieLoverBurger);
    }
}
