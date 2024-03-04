package ch06.lecture.p2method;

public class C08VarArgs {
    public static void main(String[] args) {
        C08MyClass o1 = new C08MyClass();
        o1.method1();
        o1.method1(1);
        o1.method1(1, 2);
//        o1.method1(1,2,3); // 메소드 선언을 하지 않았으므로 불가능
        o1.method2(3, 2, 1, 0, -1); // 하나의 메소드

    }
}

class C08MyClass {
    void method1() {
    }

    void method1(int a) {
    }

    void method1(int a, int b) {
    }

    // varargs(가변인자, 가변길이 매개변수)
    // 메소드 내에서 배열로 사용
    void method2(int... a) { //int가 여러개 들어 올 수 있다
        System.out.println(a.length);
    }


}

