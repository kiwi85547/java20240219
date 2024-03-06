package ch06.lecture.p5static;

public class C05Static {
}

class C05MyClass {
    // 인스턴스 필드

    // static 필드(class 변수)
    static int age;
    static double area = Math.PI * 10 * 10;

    // static block
    // static 멤버 초기 설정용
    static {
        System.out.println(" statement... ");
        area = Math.PI * 10 * 10;
        method();
    }

    // 생성자

    // 인스턴스 메소드

    // static 메소드
    static void method() {
    }

}