package collectionFrameworks.listTut;

import java.util.List;
import java.util.Stack;
/* Stack Extends Vector hence Stack is also Thread Safe */
public class StackTut {
    public static void main(String[] args) {
        List<Integer> stack = new Stack<>();
        stack.add(12);

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(12);
        stack1.push(23);
        stack1.push(45);
        System.out.println(stack1);
        stack1.pop();
        System.out.println(stack1);
        System.out.println(stack1.peek());
        System.out.println(stack1.search(23));
    }
}
