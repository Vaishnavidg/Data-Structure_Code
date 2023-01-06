package Stacks;

import java.util.Stack;

public class StackDS {
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(7);
        stack.push(8);

        System.out.println("Stack:"+ stack);
        System.out.println("Peek:"+stack.peek());


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
