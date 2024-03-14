package ch12.lecture.p2wrapper;

public class C02WrapperClass {
    public static void main(String[] args) {
        int a = 3;
        long b = a;

        Integer c = a; //auto boxing 자동박싱
//        Long d=a; // x

        Number e = a; //
        Object f = a; //
        // 기본타입도 참조타입처럼 쓸 수 있게 되었다.

    }
}
