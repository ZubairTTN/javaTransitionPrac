package multithreading.lambdaExpression;

public class HelloImpl {
    public static void main(String[] args) {
        Hello st = (String name) -> {
            System.out.println("Hello " + name);
        };
        st.sayHello("Zubair");

        Hello st2 =name -> System.out.println("Hello... " + name );
        st2.sayHello("Chanda");


    }
}
