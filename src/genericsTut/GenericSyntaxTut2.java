package genericsTut;

public class GenericSyntaxTut2<K, V>{
    private K key;
    private V value;

    public GenericSyntaxTut2(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey()
    {
        return key;
    }

    public V getValue()
    {
        return value;
    }
}

class MainNew{
    public static void main(String[] args) {
        GenericSyntaxTut2<Integer, String> boxNew1 = new GenericSyntaxTut2<>(1, "Zubair");

        System.out.println(boxNew1.getKey());
        System.out.println(boxNew1.getValue());

    }
}
