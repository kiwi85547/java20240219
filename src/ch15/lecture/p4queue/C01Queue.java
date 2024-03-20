package ch15.lecture.p4queue;

import java.util.*;

public class C01Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("java");
        queue.offer("spring");
        queue.offer("react");
        queue.offer("angular");

        System.out.println(queue.size());

        String e1 = queue.poll();
        String e2 = queue.poll();
        String e3 = queue.poll();
        String e4 = queue.poll();

        System.out.println("e1 = " + e1);
        System.out.println("e2 = " + e2);
        System.out.println("e3 = " + e3);
        System.out.println("e4 = " + e4);

    }
}

//class Solution {
//    public int countStudents(int[] students, int[] sandwiches) {
//        Queue<Integer> san = new LinkedList<>();
//        List<Integer> stu = new LinkedList<>();
//
//        for (int item : sandwiches) {
//            san.offer(item);
//        }
//        for (int item : students) {
//            stu.add(item);
//        }
//
//        for (int i = 0; i < stu.size() * 2; i++) {
//            if (stu.getFirst() == san.peek()) {
//                san.poll();
//                stu.removeFirst();
//            } else if (stu.getFirst() != san.peek()) {
//                stu.add(stu.removeFirst());
//            } else if (stu.isEmpty())
//                return 0;
//        }
//        return san.size();
//    }
//}