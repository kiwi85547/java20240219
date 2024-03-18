package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class C02List {
    public static void main(String[] args) {
        // List : 데이터의 순서(index)가 있고 중복 허용됨
        // 리스트는 인터페이스여서 객체를 만들 수 없음

        // 빈 리스트 생성
        List<String> list1 = new ArrayList<>();

        // element(요소, 원소, 아이템) 추가
        list1.add("java");
        list1.add("spring");
        list1.add("react");
        list1.add("spring");

        // element 읽기(얻기 get)
        String s1 = list1.get(2);
        System.out.println("s1 = " + s1);
        String s2 = list1.get(0);

        // 검색(contains)
        System.out.println(list1.contains("spring"));
        System.out.println(list1.contains("java"));
        System.out.println(list1.contains("html"));

        // 삭제(remove)
        list1.remove("java");

        // 전체 탐색
        // 고전적 for
        System.out.println("############고전적 for");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // 향상된 for문
        System.out.println("##########향상된 for");

    }
}
