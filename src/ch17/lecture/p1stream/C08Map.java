package ch17.lecture.p1stream;

import java.util.List;

public class C08Map {
    public static void main(String[] args) {
        // map : 각 요소를 다른 요소로 반환하는 중간 연산
        List<String> list
                = List.of("java", "css", "spring", "html", "hello wolrd");

        list.stream()
                .map(e -> e.substring(0, 1))
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .map(e -> e.length())
                .forEach(System.out::println);
    }
}
