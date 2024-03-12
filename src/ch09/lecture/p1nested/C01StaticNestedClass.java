package ch09.lecture.p1nested;

public class C01StaticNestedClass {
    public static void main(String[] args) {
        C01Myclass.C01NestedClass obj1 = new C01Myclass.C01NestedClass();
    }
}

class C01Myclass {
    // 정적(static) 중첩 중첩클래스
    static class C01NestedClass {

    }

    // 필드, 생성자, 메소드
    void method1() {
        C01NestedClass obj1 = new C01NestedClass();
    }
}