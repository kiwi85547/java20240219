package ch16.lecture.p1lambda;

public class C03FunctionalInterface {
}

//@FunctionalInterface // 추상메소드 없음 not okay
interface C03MyInterface1 {

}

@FunctionalInterface // 추상메소드가 하나 ok
interface C03MyInterface2 {
    void method1();
}

//@FunctionalInterface // 추상메소드가 둘 not okay
interface C03MyInterface3 {
    void method2();

    void method3();
}

@FunctionalInterface // 추상메소드가 하나 ok
        // 상수,default는 상관없음
interface C03MyInterface4 {
    void method4();

    default void method() {
    }
}

@FunctionalInterface // 추상메소드가 여러개인데 ok. why?
        // 모든 클래스는 object의 하위타입
        // 그러므로 재정의 하지 않아도 됨
        // Object public 메소드는 인터페이스의 추상메소드로 count 안함
interface C03MyInterface5 {
    void method();

    String toString();

    int hashCode();

    boolean equals(Object o);
}