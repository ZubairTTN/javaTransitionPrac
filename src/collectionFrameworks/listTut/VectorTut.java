package collectionFrameworks.listTut;

import java.util.List;
import java.util.Vector;

/* Vector is an older implementation of List.
It is similar to ArrayList because it also uses a dynamic array internally.
Vector methods are synchronized.*/
public class VectorTut {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5, 5);
        vector.add(12);
        vector.add(23);
        vector.add(56);
        vector.add(56);
        vector.add(56);
        vector.add(2, 34);
        System.out.println(vector.capacity());
        vector.add(56);
        System.out.println(vector.capacity());
        System.out.println(vector);
    }
}
