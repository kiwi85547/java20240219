package ch17.lecture.p1stream;

import java.util.List;

public class C10Limit {
    public static void main(String[] args) {
        // limit : 주어진 수 만큼의 요소의 스트림을 리턴
        List<Integer> list = List.of(8, 8, 10, 10, 5, 3, 22, 1, 0);

        list.stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted()
                .limit(5)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted((a, b) -> b - a) //역순으로 comparator
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("--------");
        list.stream()
                .sorted()
                .distinct()
                .limit(2)
                .skip(1) //2번째로 작은 값 출력
                .forEach(System.out::println);

        System.out.println("--------");
        list.stream()
                .sorted((a, b) -> b - a)
                .distinct()
//                .limit(2)
                .skip(2) //
                .forEach(System.out::println);
    }
}
