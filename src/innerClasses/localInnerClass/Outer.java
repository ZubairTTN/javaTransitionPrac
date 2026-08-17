package innerClasses.localInnerClass;
/* A local inner class in Java is a class that is declared inside a method, constructor, or block of code. It is only accessible within that block.
* Characteristics
1. It is defined inside a method, constructor, or block.
2. It cannot be accessed outside the method where it is declared.
3. It can access:
    Members (fields and methods) of the outer class.
    Local variables of the enclosing method only if they are final or effectively final (their value doesn't change after initialization).
* */

public class Outer {
    void display()
    {
        int number = 10;
//        Local Inner Class 
        class LocalInner{
            void message()
            {
                System.out.println("Hello from local inner class... accessing local variable int: " + number);  // Eg. Accessing Local Variables
            }
        }

        LocalInner obj = new LocalInner();
        obj.message();
    }
}

class Main{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}
