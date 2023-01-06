package Stacks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(7);
        stack.push(8);
        stack.push(43);
        stack.push(22);

        System.out.println(stack.peek());


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack);

    }
}
