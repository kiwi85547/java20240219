package ch09.lecture.p2anonymous;

public class C01AnonymousClass {
    public static void main(String[] args) {
//        C01MyClass obj = new C01MyClass();
//        C01MyClass obj = new C01Child();
        // 추상클래스는 객체를 못만듬....
        // 익명클래스의 객체
        C01Parent obj = new C01Parent() {

        };
        // 클래스와 인스턴스를 동시에 만든다.

    }
}

abstract class C01Parent {
}
//class C01Child extends C01MyClass{}