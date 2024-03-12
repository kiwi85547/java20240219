package ch09.lecture.p2anonymous;

public class C06AnonymousClass {
    C06MyInterface o = new C06MyInterface() {
        @Override
        public void method1() {
            System.out.println("C06AnonymousClass.method1");
        }

        @Override
        public void method2() {
            System.out.println("C06AnonymousClass.method2");
        }
    };

}

interface C06MyInterface {
    void method1(); //추상 메소드

    void method2();
}