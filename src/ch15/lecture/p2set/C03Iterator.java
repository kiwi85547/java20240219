package ch15.lecture.p2set;

import java.util.*;

public class C03Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("react");
        list.add("spring");
        list.add("html");

        //고전적 for, 향상된 for, forEach
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            String s = list.get(i);
            // 탐색하는 중간에 지울 수 없음
            if (s.length() % 2 == 1)
                list.remove(i);
            System.out.println("list = " + list);
        }

        System.out.println("Iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("next = " + next);
            // 탐색하는 중간에 지우기
            if (next.length() % 2 == 1)
                iterator.remove();
        }
        System.out.println("list = " + list);
    }
}
