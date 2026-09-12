package designPatterns.creationalDesignPatterns.builderPattern.builderPattern;
/* Think of it as:
Builder
   |
   ├── name()
   ├── email()
   ├── age()
   |
   ↓
build()
   |
   ↓
User object */
public class BuilderPattern {
    public static void main(String[] args) {
        User user = new User.Builder()
                .name("Zubair")
                .email("zubair@example.com")
                .age(23).build(); /* build(): creates the actual object. */

        System.out.println(user);
    }
}

class User{
    private String name;
    private String email;
    private int age;

//    Constructor
    private User(Builder builder)
    {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
    }

    public static class Builder{
        private String name;
        private String email;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

/* The Builder Pattern is a creational design pattern that solves a very common headache in programming: creating objects that have a ton of optional and mandatory fields.

Think about ordering a custom burger or configuring a laptop online. You don't pass all your options in a single, rigid sentence. Instead, you pick your base, add cheese, select extra bacon, and then click "Build My Burger." That is exactly what the Builder pattern does in code.
The Problem It Solves: The "Telescoping Constructor"

Imagine you are building a User class with properties like username, email, age, phone, address, and city.

If you use traditional constructors, you end up writing code like this:

    User user = new User("Alice", "alice@email.com"); (What if you want to add an age?)

    User user = new User("Alice", "alice@email.com", 25, "123-456"); (It gets confusing to remember which parameter is which, and you often have to pass null for fields you don't care about).

This is called the Telescoping Constructor anti-pattern, and it makes code unreadable and error-prone.
How the Builder Pattern Works

Instead of calling a giant constructor, the Builder pattern uses a helper class (usually a static inner class) to collect the data piece-by-piece using method chaining, and then builds the final object. */

