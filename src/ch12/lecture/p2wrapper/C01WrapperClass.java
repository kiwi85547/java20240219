package ch12.lecture.p2wrapper;

public class C01WrapperClass {
    public static void main(String[] args) {
        // 기본타입 8개를 각각 감싼 참조타입(클래스)8개
        // byte, short, int, long, float, double, boolean, char
        // Byte, Short, Integer,

        int a = 3;
        // boxing
        Integer c = Integer.valueOf(a); // 오래전..
        Integer b = a; // 현재 auto boxing

        double f = 3.14;
        Double g = f;

        char h = '가';
        Character i = h;

        boolean j = true;
        Boolean k = j;

    }
}
