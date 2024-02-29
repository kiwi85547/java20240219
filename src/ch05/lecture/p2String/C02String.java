package ch05.lecture.p2String;

public class C02String {
    public static void main(String[] args) {
        // new 연산자 생략하고 썼을 땐 참조값이 같다.
        // new 연산자는 새 인스턴스를 생성

        String a = "son";
        String b = "lee";
        String c;
        c = "son";  // 선언과 대입 따로 가능
        String d = new String("son");

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        System.out.println(a == c); //true
        System.out.println(a == d); //false

        System.out.println(a.equals(c)); //true
        System.out.println(a.equals(d)); //true

        // 내용물 비교
        // String 비교는 equals 사용. 실수 하지 않도록 주의

    }
}
