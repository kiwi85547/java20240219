package ch17.sec10;

import java.sql.Array;
import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {
        // list의 원소가 없음. 즉, 빈 lsit
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);

        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue) // 기본 타입으로 변경. IntStream으로 변경
                .average(); //IntStream 인터페이스에서 OptionalDouble을 반환하는 메소드
        if (optional.isPresent())
            System.out.println(optional.getAsDouble());
        else System.out.println("평균:0.0");

        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0000001);
        System.out.println("avg = " + avg);

        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("ifPresent메소드:" + a));

    }
}
