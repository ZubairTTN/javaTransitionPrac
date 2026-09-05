package collectionFrameworks.listTut;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* Java's LinkedList is actually a doubly linked list. previous ← [DATA] → next
*
* Insertion and Deletion: LinkedList is better for frequent insertions and deletions in the middle of the list because it does not require shifting elements as in ArrayList*/
public class LinkedListTut {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Mohd");
        linkedList.add("Zubair");
        linkedList.add("Ahmed");
        System.out.println(linkedList);
        for (String name: linkedList)
        {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println(linkedList.get(2));

        LinkedList<Integer> nums = new LinkedList<>();
        nums.addFirst(23);
        nums.add(2);
        nums.add(64);
        nums.add(43);
        nums.addFirst(65);
        nums.addLast(32);
        System.out.println(nums.getFirst());
        System.out.println(nums.getLast());
//        nums.removeIf(x -> x%2 ==0);
        System.out.println(nums);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        System.out.println(animals);
        LinkedList<String> animals1 = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animals.removeAll(animals1);
        System.out.println(animals);


    }
}
