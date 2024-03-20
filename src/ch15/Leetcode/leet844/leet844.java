package ch15.Leetcode.leet844;

import java.util.Stack;

public class leet844 {
}

class Solution {
    public boolean backspaceCompare(String s, String t) {
        //stack 객체 생성. character?
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (Character item : s.toCharArray()) {
            if (item != '#') {
                stack1.push(item);
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }

        for (Character item : t.toCharArray()) {
            if (item != '#') {
                stack2.push(item);
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }

        return stack1.equals(stack2);
    }
}

// 강사님 코드
class Solution2 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        // s의 각 문자를 stack1에 push,pop
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else
                stack1.push(c);
        }

        for (int i = 0; i < t.length(); i++) {
            char b = t.charAt(i);
            if (b == '#')
                if (!stack2.isEmpty()) {
                    stack2.pop();
                } else
                    stack2.push(b);
        }

        // 두 stack 크기가 같은지
        if (stack1.size() != stack2.size())
            return false;

        // 두 stack의 각 아이템이 같은지
        for (int i = 0; i < stack1.size(); i++) {
            if (!stack1.get(i).equals(stack2.get(i)))
                return false;
        }
        return true;
    }
}