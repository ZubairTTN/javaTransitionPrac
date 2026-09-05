package collectionFrameworks.comparatorTut;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa)
    {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName()
    {
        return name;
    }

    public double getGpa()
    {
        return gpa;
    }
}

public class MainStudent{
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Zubair", 4.9));
        studentList.add(new Student("Ahmed", 3.7));
        studentList.add(new Student("Sonu", 4.2));
        studentList.add(new Student("Farida", 4.8));

        studentList.sort((o1, o2) -> {

            if (o2.getGpa() - o1.getGpa() > 0)
            {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            }
            else{
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(Student st: studentList)
        {
            System.out.println(st.getName() + " " + st.getGpa());
        }

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed();

    }
}
