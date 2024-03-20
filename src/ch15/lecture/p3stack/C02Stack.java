package ch15.lecture.p3stack;

import java.util.Stack;

public class C02Stack {
    public static void main(String[] args) {
        var stack = new Stack<String>();

        stack.push("son");
        stack.push("lee");

        String item1 = stack.peek(); //lee
        String item2 = stack.peek(); //lee

        System.out.println("item1 = " + item1);
        System.out.println("item2 = " + item2);
        System.out.println(stack.size());
    }
}
