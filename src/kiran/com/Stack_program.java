package kiran.com;

import java.util.Stack;

public class Stack_program {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());  //--> Return boolean expression
        System.out.println(stack);
    }
}
