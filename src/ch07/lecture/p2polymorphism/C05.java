package ch07.lecture.p2polymorphism;

public class C05 {
    // 필드, 파라미터, 지역변수

    public static void main(String[] args) {
        // 지역변수
        A a = new A();


    }
//    public static method(){}
}

class A {
    public void method1() {
        System.out.println("A.method1");
    }
}

class B extends A {
    @Override
    public void method1() {
        System.out.println("B.method1");
    }
}

class C extends A {
}