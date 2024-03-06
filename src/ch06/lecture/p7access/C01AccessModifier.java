package ch06.lecture.p7access;

public class C01AccessModifier {
    public static void main(String[] args) {
        C01MyClass obj = new C01MyClass();
        obj.method1();
        obj.number = 2;
        System.out.println("obj = " + obj.number);
    }
}

// access modifier ( 접근 제한자, 접근 제어자)
// 필드, 메소드
// 생성자, 클래스에 작성 가능

// public, protected, private

//
// protected
//    : 다른 패키지여도 상속받으면 접근 가능
//
// package private, default
//    : 같은 패키지내에서 접근 가능
//

// public field

