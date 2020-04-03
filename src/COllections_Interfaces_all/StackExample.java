package COllections_Interfaces_all;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(123);
        stack.push(212);
        stack.push(1233);

        System.out.println(stack);

        System.out.println(stack.push(12344));
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println(stack.search(123));
        int a = stack.size();
        System.out.println(a);

        System.out.println(stack.isEmpty());

        System.out.println(stack.push(1));

        System.out.println(stack);


    }
}
