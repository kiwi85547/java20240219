package ch12.lecture.p2wrapper;

public class C05Compare {
    public static void main(String[] args) {
        int a = 60000;
        int b = 60000;

        System.out.println(a == b); //true

        Integer c = 70000;
        Integer d = 70000;

        System.out.println(c == d); //false
        System.out.println(c.hashCode()); //Integer의 해시코드는 재정의 되어 있기 때문에 의미 없음
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        // ************아주아주아주아주아주 중요
        // 참조타입 비교는 equals 사용!!!
        // **********************************
        System.out.println(c.equals(d)); //true

        int f = 80000;
        int g = 80000;

        System.out.println(f);
    }
}
