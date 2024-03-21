package ch17.lecture.p1stream;

import com.sun.source.tree.UsesTree;

import java.util.List;
import java.util.stream.Stream;

public class C04Intermediate {
    public static void main(String[] args) {
        // 중간연산 (intermediate operation)
        // filter, map, distinct, sorted, peek, limit, skip

        // 중간연산은 최종연산이 있을 때만 실행

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
//                test메소드
        Stream<Integer> stream = list.stream();
        list.stream()
                .filter(e -> {
                    System.out.println(e);
                    return true;
                });

        long count = stream.count();

        // 중간 Stream 변수 없이 사용
        list.stream()
                .filter(e -> {
                    System.out.println(e);
                    return true;
                })
                .count();
    }
}
