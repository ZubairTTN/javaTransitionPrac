package genericsTut.genericConstructor;

import genericsTut.genericInterface.GenericContainer;

public class GenericConstructors {
//    Syntax
    public <T> GenericConstructors(T value)
    {
        System.out.println(value);
    }

    public static void main(String[] args) {
        GenericConstructors constr = new GenericConstructors(23);
        new GenericConstructors("Zubair");
        new GenericConstructors(23.76);
    }
}
