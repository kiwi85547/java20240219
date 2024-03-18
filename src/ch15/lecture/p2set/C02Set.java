package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        var list = List.of("a", "s", "c");
        list.get(2);

        Set<String> set = new HashSet<>();
        set.add("hy");
        set.add("sh");

        System.out.println("####향상된 for문#####");
        for (String item : set) {
            System.out.println(item);
        }

        // forEach 메소드 // 람다식
        System.out.println("forEach");
        set.forEach(System.out::println);

        //Iterator 사용
        // hasNext 탐색할 아이템이 있는지?
        // next 다음 아이템 리턴 // 외울 내용은 아님
        // while문과 어울림
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("next = " + next);
        }


    }
}
