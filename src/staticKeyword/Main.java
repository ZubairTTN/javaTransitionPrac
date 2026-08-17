package staticKeyword;

public class Main {
    public static String college = "AKTU";
    String name;
    static {
        System.out.println("this is a static block and this gets executed as soon as class is initialized by the JVM in the memory and this gets executed only once for that class initialization");
    }

//    public static void sayHello()
//    {
//        System.out.println("saying hello to : " + name); // here we will be encountering error as we are accessing non static field from a static method context.
//    }
}

class Test{
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.college); // we can access Static fields and methods using respective class object as well but it is not generally recommended

    }
}


