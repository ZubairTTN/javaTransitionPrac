package genericsTut.genericInterface;

public interface Container<T>{
    public abstract void add(T item);

    T get();
}


