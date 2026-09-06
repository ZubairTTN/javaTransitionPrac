package collectionFrameworks.mapTut.comparableTut;
/* Comparable is an interface in Java used when we want a class to define its natural/default ordering.
In simple words:
Comparable tells an object: "If you have to compare yourself with another object of the same type, this is how you should decide which one comes first."

Comparable = The object tells Java how it should naturally be sorted.
Comparator = Someone outside the object tells Java how to sort it this time.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Zubair", 23));
        students.add(new Student("Ali", 18));
        students.add(new Student("Rahul", 25));
        students.add(new Student("John", 20));
        Collections.sort(students);
//        students.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(students);  // here natural ordering is defined as per age.

    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student other) {
        return other.age - this.age;
    }

    @Override
    public String toString()
    {
        return name + " - " + age;
    }
}

/* 1. First, what problem are Comparable and Comparator solving?

Suppose we have a Student class:

class Student {
    int id;
    String name;
    int age;
    double marks;

    // constructor...
}

And we have:

List<Student> students = new ArrayList<>();
Suppose the list contains:

ID    Name      Age    Marks
--------------------------------
103   Zubair     21     85
101   Ali        20     92
102   John       22     78

Now you say:

Sort these students.

Java has a problem:

Sort them according to what?

Should it be:

ID?
Name?
Age?
Marks?

This is where comparison comes in.

We need to provide Java with a rule for comparing two Student objects.

There are two major ways:

Comparable
    ↓
Define the natural/default ordering

Comparator
    ↓
Define custom/alternative ordering
2. Comparable

Comparable is an interface from:

java.lang

Its important method is:

int compareTo(T o)

Example:

class Student implements Comparable<Student> {

    int age;

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
}

Now Student is saying:

"My natural ordering is based on age."

So:

Collections.sort(students);

can sort students by age.

3. Comparator

Comparator is an interface from:

java.util

Its important method is:

int compare(T o1, T o2)

Example:

Comparator<Student> byName =
        (s1, s2) -> s1.name.compareTo(s2.name);

Now we're saying:

"For this particular sorting operation, compare Students by their names."

Then:

students.sort(byName);

sorts by name.

Notice something important:

Comparable

The Student class itself contains the comparison logic.

class Student implements Comparable<Student>
Comparator

The comparison logic exists outside the Student class.

Comparator<Student>

This is the fundamental difference.

4. The biggest difference

Think about it like this.

Comparable

The object says:

"This is how I naturally compare myself with another object."

Student
   │
   └── compareTo()
          │
          └── age
Comparator

An external object says:

"I know how to compare two Student objects."

Comparator
    │
    └── compare()
           │
           └── name / age / marks / ID

So:

Comparable → comparison logic belongs to the class
Comparator → comparison logic belongs outside the class
 */