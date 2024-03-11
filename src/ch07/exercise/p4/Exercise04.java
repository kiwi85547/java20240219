package ch07.exercise.p4;

public class Exercise04 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.method2();
    }
}

class Parent {
    public void method1(int a) {
    }

    void method2() {
    }
}

class Child extends Parent {
    //컴파일러가 컴파일시 이 메소드가 재정의한 것인지 체크 함
    @Override
    public void method1(int a) {
        super.method1(a);
    }

    // 부모 메소드보다 좁은 접근 제한자를 붙일 수 없다.
    @Override
    void method2() {
        super.method2();
    }
}