package ch17.lecture.p1stream;

import java.util.List;

public class C09Sorted {
    public static void main(String[] args) {
        // sorted : 정렬된 stream 리턴
        List<Integer> list = List.of(9, 3, 8, 66, 8);
        list.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("-------------------");

        list.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);

        List<String> list1 = List.of("java", "Sua", "jaehoo", "sua");
        list1.stream()
                .sorted()
                .forEach(System.out::println);

        list1.stream()
                .sorted()
                .map(e -> e.length())
                .forEach(System.out::println);

        System.out.println("########");
        list1.stream()
                .map(e -> e.length())
                .sorted()
                .forEach(System.out::println);
    }
}
