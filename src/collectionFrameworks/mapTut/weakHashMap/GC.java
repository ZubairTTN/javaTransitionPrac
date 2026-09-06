package collectionFrameworks.mapTut.weakHashMap;

import java.lang.ref.WeakReference;

/* Garbage Collection */
/* A Weak Reference is a special type of reference that allows you to refer to an object without preventing that object from being garbage collected. */
public class GC  {
    public static void main(String[] args) {
//      Strong Reference
//        Phone phone = new Phone("Apple", "16 pro"); // here phone is a strong reference
//        System.out.println(phone);
//        phone = null;
////        System.gc();
//        System.out.println(phone);

//        Weak Reference
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Samsung", "Note 26 ultra"));

//        Phone smartPhone = new Phone("Vivo", "X300pro");
//        WeakReference<Phone> phoneWeakReference1 = new WeakReference<>(smartPhone);
//        System.out.println(phoneWeakReference1.get());

        System.out.println(phoneWeakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        }
        catch (Exception e)
        {
            Thread.currentThread().interrupt();
            System.out.println(e.getMessage());
        }
        System.out.println(phoneWeakReference.get());
        /*
        *              strong reference
smartPhone ──────────────────────► Phone
                                    ▲
                                    │
                             weak reference
                                    │
                              phoneWeakReference1 */
    }
}

class Phone{
    String brand;
    String model;
    public Phone(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }

//    toString() returns a String representation of an object.
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
