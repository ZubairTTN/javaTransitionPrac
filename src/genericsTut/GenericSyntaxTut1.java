package genericsTut;
/* Syntax: className<T>
*
* here GenericSyntaxTut1 is having a bounded generic type that is it can only have those generics only which implement the Number class such as Integer, Float, Long, Double etc.. and these are known as Bounded Type parameters*/
public class GenericSyntaxTut1<T extends Number> {
    private T value;

    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }
}

class Main{
    public static void main(String[] args) {
        GenericSyntaxTut1<Integer> box = new GenericSyntaxTut1<>();
        box.setValue(23);
        System.out.println(box.getValue());

    }
}
