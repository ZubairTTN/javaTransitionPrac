package dataTypes;

public class TestString {
    public static void main(String[] args)
    {
        String name = "Zubair";
        System.out.println(name);
        String a = new String("Zubair");
        String b = new String("Zubair");
        System.out.println(a == b); // this compares the a and b here a and b store the refernces(a and b store references that identify/allow access to two different String objects.)
        System.out.println(a.equals(b)); // this compares the actual stored value that is Sonu;

        String c = "Zubair";
        String d = "Zubair";
        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println("ASCII value of Z is: ");
        System.out.println('z' + 0);
        String e = "Ahmed";
        String f = "AHMED";
        System.out.println(e.compareTo(f));
        System.out.println(e.compareToIgnoreCase(f));

        String fullName = "Mohd Zubair Ahmed";
        System.out.println(fullName.substring(5, 15)); // here index 5 is included and index 15 is excluded
        System.out.println(fullName.substring(5, fullName.length())); // here fullName.length() is excluded
        System.out.println(fullName.lastIndexOf('e'));
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());
        String nameWithExtraSpace = "            Mohd Zubair       Ahmed                        ";
        System.out.println(nameWithExtraSpace.trim()); // trim() method only removes the extra space from the start and end of the String.
        String newName = fullName.replace("Ahmed", "Khan").toUpperCase();
        System.out.println(newName);
        System.out.println(newName.contains("ZUBA"));
        System.out.println(newName.contains("zuba"));
        String space = "";
        String space1 = " ";
        System.out.println(space1.isEmpty());
        System.out.println(space1.isBlank());
        System.out.println(space.isBlank());
        System.out.println(space.isEmpty());

        int z = 12;
        String zz = String.valueOf(z); // here we have converted the int into String
        System.out.println(zz.toLowerCase());

        System.out.println(fullName.subSequence(2, 15)); // gives/ returns charSequence
        System.out.println(fullName.substring(2, 15)); // returns a part of String

//        Reference:
        /* https://chatgpt.com/share/6a802a74-2acc-83e8-b7b3-ce0142467527 */



    }
}
