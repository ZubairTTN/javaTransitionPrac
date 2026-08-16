package oops.encapsulation;
/* Encapsulation means wrapping up of data and methods in a single unit known as Class inorder to restrict direct access to the data
* Benefit: Protects data from unauthorized access.
* Encapsulation = controlling access to an object's data
Typically, we achieve encapsulation by:
Making the class fields private
Providing public getter/setter methods when outside code needs controlled access.*/
// A class consists of properties/Fields/instance variable and Behavior/Methods
public class EncapsulationTut {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Zubair");
        System.out.println(s1.getName());
    }
}
class Student{
    private String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
