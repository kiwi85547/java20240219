package ch15.Leetcode.leet1700;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leet1700 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.countStudents(new int[]{0, 0, 0, 1, 1, 1, 1, 0, 0, 0}, new int[]{1, 0, 1, 0, 0, 1, 1, 0, 0, 0});
        System.out.println(result);
    }
}

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> san = new LinkedList<>();
        List<Integer> stu = new LinkedList<>();

        for (int item : sandwiches) {
            san.offer(item);
        }
        for (int item : students) {
            stu.add(item);
        }

        int remain = san.size();
        while (!stu.isEmpty() && remain > 0) {
            if (stu.getFirst() == san.peek()) {
                san.poll();
                stu.removeFirst();
                remain = san.size();
            } else if (stu.getFirst() != san.peek()) {
                remain--;
                stu.add(stu.removeFirst());
                System.out.println("stu = " + stu);
                System.out.println("san = " + san);
            } else if (stu.isEmpty())
                return 0;
        }
        return san.size();
    }
}