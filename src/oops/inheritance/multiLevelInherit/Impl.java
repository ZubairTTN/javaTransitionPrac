package oops.inheritance.multiLevelInherit;
/* Note: 1. Reference type decides what methods you are allowed to call
* 2. Actual object decides which overridden method actually runs.
* Inheritance happens in multiple levels.
* Grandparent
     ↑
     |
   Parent
     ↑
     |
    Child */
public class Impl {
    public static void main(String[] args) {
        Child c1 = new Child(false);
        c1.eat();
        c1.speaks();
        c1.cry();
        c1.setName("Zubair");
        System.out.println(c1.getName());
        System.out.println(c1.hasSuperpower());

        GrandParent g1 =  new GrandParent(true);
        System.out.println(g1.getName());
        System.out.println(g1.hasSuperpower());

    }
}
