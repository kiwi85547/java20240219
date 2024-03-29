package ch17.lecture.p1stream;

import java.util.List;
import java.util.Optional;

public class C12Reduce {
    public static void main(String[] args) {
        List<String> list1 = List.of("j", "a", "v", "a");
        String reduce1 = list1.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println("reduce1 = " + reduce1);

        List<Integer> list2 = List.of(2, 4, 6, 8, 10);
        Optional<Integer> reduce2 = list2.stream()
                .reduce((a, b) -> a * b);
        System.out.println("reduce2 = " + reduce2.orElse(0));
        // orElse를 쓰지 않으면 객체의 주소가 출력됨.

        Integer reduce3 = list2.stream()
                .reduce(100, (a, b) -> a + b);
        System.out.println("reduce3 = " + reduce3);

        List<String> list3 = List.of();

        Optional<String> reduce4 = list3.stream().reduce((a, b) -> a + b);
        System.out.println("reduce4 = " + reduce4);
//        if (reduce4.isPresent()) {
//            System.out.println("reduce4 = " + reduce4);
//        }
    }
}
