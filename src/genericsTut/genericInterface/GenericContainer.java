package genericsTut.genericInterface;

public class GenericContainer<T> implements Container<T>{
    T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}

class Main{
    public static void main(String[] args) {
        GenericContainer<String> container = new GenericContainer<>();
        container.add("Zubair");
        System.out.println(container.get());

        container.add("Ahmed");
        System.out.println(container.get());
    }
}
