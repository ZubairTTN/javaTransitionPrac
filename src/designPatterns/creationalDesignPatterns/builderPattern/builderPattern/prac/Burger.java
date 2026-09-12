package designPatterns.creationalDesignPatterns.builderPattern.builderPattern.prac;

public class Burger {
//    Required
    private final String bun;
    private final String patty;

//    optional
    private final boolean cheese;
    private final boolean lettuce;
    private final boolean tomato;
    private final boolean onion;
    private final boolean sauce;

//    private constructor - only builder can create Burger
    private Burger(BurgerBuilder builder)
    {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.onion = builder.onion;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString()
    {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                ", onion=" + onion +
                ", sauce=" + sauce +
                '}';
    }

//    Static Nested Builder CLass
    public static class BurgerBuilder{
        private final String bun;
        private final String patty;

        private boolean cheese;
        private boolean lettuce;
        private boolean tomato;
        private boolean onion;
        private boolean sauce;

//        Required Fields go into builder's constructor
    public BurgerBuilder(String bun, String patty)
    {
        this.bun = bun;
        this.patty = patty;
    }

//    Optional fields use chain setters methods
    public BurgerBuilder addCheese()
    {
        this.cheese = true;
        return this; // returning this enables chaining
    }
    public BurgerBuilder addLettuce() {
        this.lettuce = true;
        return this;
    }

    public BurgerBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    public BurgerBuilder addOnion() {
        this.onion = true;
        return this;
    }

    public BurgerBuilder addSauce() {
        this.sauce = true;
        return this;
    }

//    final step builds the actual objects
    public Burger build()
    {
        return new Burger(this);
    }
}
}
