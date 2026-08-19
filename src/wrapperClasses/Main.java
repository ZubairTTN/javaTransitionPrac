package wrapperClasses;

public class Main {
    public static void main(String[] args) {
        int a = 9;
        Integer b = 10; // this is autoboxing
        Integer c = Integer.valueOf(5); // this is known as boxing
        int cc = c.intValue(); // this is unboxing
        Integer dd = null; //wrapper class can hold null value, primitive datatypes cannot
        String str ="Zubair";
        str.toUpperCase();
        Boolean isDev = true;
        Float f = 1.24f;
        Double d = 2.3456d;
        System.out.println(d);
        Character ch = 'c';
        Byte bb = 1;
        Short s = 2;
        Long l = 1234l;
    }
}
