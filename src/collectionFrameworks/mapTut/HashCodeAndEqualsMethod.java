package collectionFrameworks.mapTut;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Student, String> students = new HashMap<>();
        Student s1 = new Student("Zubair", 21);
        Student s2 = new Student("Kaici", 51);
        Student s3 = new Student("Akhil", 43);
        Student s4 = new Student("Zubair", 21);

        students.put(s1, "Backend Dev"); //hashcode1 --> index1
        students.put(s2, "Quant Dev"); //hashcode2 --> index2
        students.put(s3, "Frontend Dev"); //hashcode3 --> index3
        students.put(s4, "Cloud Architect"); //hashcode1 --> index1
        System.out.println("Value of S1: " + students.get(s1));
        System.out.println("Value of S4: " + students.get(s4));
        System.out.println("HashMap size is: " + students.size());

        for (Map.Entry<Student, String> entry : students.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }

        System.out.println("\nUsing Lambda Expression...");
        students.forEach((student, role) -> {
            System.out.println(student.getName() + "-> " + role);
        });


//        Map<String, Integer> map = new HashMap<>();
//        map.put("Zubair", 98); // hashcode1 --> index1
//        map.put("Sonu", 87); // hashcode2 --> index2
//        map.put("Zubair", 92); // hashcode1 --> index1 --> equals() --> replace

    }
}

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    /* Below Method Define how one Student should be compared with another Student for logical equality. */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) /* This is checking: Are both references pointing to the exact same object? */ {
            /* Let's say:
        Student s1 = new Student("Zubair", 21);
        students.put(s1, "Backend Dev");

        Later:
        s1.equals(s1)

        Inside equals():
        this → s1
        obj  → s1

        So:
        this == obj

        is:
        s1 == s1

        which is:
        true

        Therefore:
        return true; */
            return true;
        }
        if (obj == null) { /* If someone is asking whether this Student is equal to null, the answer is false. */
            return false;
        }
        if (this.getClass() != obj.getClass()) { /* This checks: Are this and obj objects of exactly the same class? */
            return false;
        }
        Student other = (Student) obj; // type casting
        return id == other.getId() && Objects.equals(name, other.getName());
        /* You're saying:
        Two Student objects are equal if:
        Their IDs are equal
        Their names are equal */
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }
}
