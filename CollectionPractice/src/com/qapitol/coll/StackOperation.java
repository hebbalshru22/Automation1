package com.qapitol.coll;

import java.util.List;
import java.util.Stack;

public class StackOperation {
    public static void main(String args[]) {


        Stack<Integer> stack = new Stack<Integer>();
        stack.push(12);
        stack.push(22);
        stack.push(23);
        stack.push(230);
        stack.push(220);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.empty());





    }

}
