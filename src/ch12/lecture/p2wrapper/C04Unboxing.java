package ch12.lecture.p2wrapper;

public class C04Unboxing {
    public static void main(String[] args) {
        Integer a = 3; //auto boxing

        // unboxing
        int b = a; // 옛날엔 안됐음. 기본타입으로 변환하기. unboxing
        int c = a; // 현재는 auto unboxing

        Long d = 5L;

        long e = d; //auto unboxing
        double f = e; //기본 타입 형변환
        double g = d; //auto unboxing + 기본 타입 형변환

        Integer h = null;
        int i = h; // auto unboxing
        // NullPointerException 에러 발생

        System.out.println("종료");
    }
}
