package collectionFrameworks.queueTut.priorityQueueTut;

import java.util.PriorityQueue;

class Student {
    String name;
    int marks;

    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
}

public class PriorityQueueObjects{
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>((s1, s2) -> Integer.compare(s2.marks, s1.marks)); /* We want the student with the highest marks first. */
        pq.offer(new Student("Akshat", 70));
        pq.offer(new Student("Zubair", 90));
        pq.offer(new Student("Kauhstub", 80));
        for(Student st: pq )
        {
            System.out.println(st.name + st.marks);
        }
    }
}
