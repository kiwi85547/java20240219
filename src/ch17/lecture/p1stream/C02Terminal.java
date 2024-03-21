package ch17.lecture.p1stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C02Terminal {
    public static void main(String[] args) {
        // 최종연산
        // 자주 사용하는 것
        // forEach, collect, count, reduce
        // anyMatch, allMatch
        // max, min

        // 클래스 없음
        // 리스트에 있는 스트림 메소드? 셋.? 맵에는 없음
        List<Integer> list = List.of(9, 8, 1, 0, 5, 3, 4, 50);

        // 어딘가에 있는 스트림 메소드를 써야함
        // 우리는 주로 컬렉션을 씀
        Stream<Integer> stream = list.stream();
//        stream.forEach();
//        stream.count();
//        stream.max();

        // 3월21일 오후 2시30분 설명
        stream.forEach(e -> System.out.println(e));

        // 이렇게 간결히!
        list.stream()
                .forEach(System.out::println);

        long count = list.stream()
                .count();
        System.out.println("count = " + count);

        Optional<Integer> max = list.stream()
                .max((a, b) -> a - b);
        System.out.println("max = " + max);

        Optional<Integer> min = list.stream()
                .min((a, b) -> a - b);
        System.out.println("min = " + min);
    }
}
