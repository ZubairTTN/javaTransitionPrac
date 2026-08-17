package innerClasses.staticInnerClass;
/* In Java, the static keyword is not permitted on top-level classes. If you try to declare a standalone class as static, the compiler will throw an error: modifier static not allowed here.
However, you can declare a nested class (a class inside another class) as static. */
// NESTED STATIC CLASS
public class Student {

    public static class Test{
        public void hello(){
            System.out.println("Hello World");
        }

        public static class Test2{
            private static void sayHello()
            {
                System.out.println("Hello Zubair");
            }
        }
    }

    public static class Test3{
        static void hi()
        {
            System.out.println("Hi Zubair");
        }
    }

    public static void main(String[] args) {
        Student.Test m = new Student.Test();
        m.hello();

        Student.Test3 m3 = new Student.Test3();
        m3.hi();

        Student.Test.Test2.sayHello();

    }
}
