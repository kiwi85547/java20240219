package ch17.lecture.p3optional;

import java.util.Optional;

public class C01Optional {
    public static void main(String[] args) {
        // Optional
        // null이 아닌 값을 포함할 수 있는 컨테이너(값을 담을 수 있는 것)

        Optional<String> s = Optional.of("java");
        Optional<Integer> i = Optional.of(2);
        Optional<Double> d = Optional.of(3.14);
        Optional<Double> m = Optional.of(null); // null 불가능
        Optional<Double> n = Optional.ofNullable(null); // 빈 optional 리턴

        Optional<Object> container1 = Optional.empty();

        // 값이 있는 지?
        boolean b1 = s.isPresent(); //true

        // 값이 없는 지?
        boolean b3 = s.isEmpty();

        // 값을 꺼내기
        String s1 = s.get();
        Integer i1 = i.get();
        Double d1 = d.get();
//        Object o = container1.get(); //exception //안에 값이 없으므로

        String s2 = s.orElse(""); // 값이 있으면 값 리턴, 없으면 other 리턴

        System.out.println("C01Optional");


    }
}
