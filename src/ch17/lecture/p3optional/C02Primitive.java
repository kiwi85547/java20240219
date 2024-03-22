package ch17.lecture.p3optional;

import java.util.Optional;
import java.util.OptionalInt;

public class C02Primitive {
    public static void main(String[] args) {
        // OptionalInt : 기본타입 int값을 가지고 있을 수 있는 컨테이너
        // OptionalDouble : 기본타입 double값을 가지고 있을 수 있는 컨테이너
        // OptionalLong : 기본타입 long값을 가지고 있을 수 있는 컨테이너

        // 직접 OptionalInt를 만드는 일은 없고 스트림에서 만들어서 주는 경우가 많음
        OptionalInt o1 = OptionalInt.of(3);
        OptionalInt o2 = OptionalInt.empty();

        // isPresent : 값이 있으면 true
        o1.isPresent(); // tree
        o2.isPresent(); // false

        // isEmpty : 값이 없으면 true
        o1.isEmpty(); // false
        o2.isEmpty(); // true

        // getAsInt : 값 얻기 (없으면 Exception)
        o1.getAsInt(); //3
//        o2.getAsInt(); // Exception

        // orElse : 값 없으면 기본값으로 얻기
        o1.orElse(0); //3
        o2.orElse(0); //0

        System.out.println(o1.orElse(500));
        System.out.println(o2.orElse(500));
    }
}
