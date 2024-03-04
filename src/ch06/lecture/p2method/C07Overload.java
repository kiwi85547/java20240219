package ch06.lecture.p2method;

public class C07Overload {
    public static void main(String[] args) {
        C07MyClass a = new C07MyClass();
        // 메소드 호출 시 argument의 타입을 보고 실행 시킬 메소드 결정됨
        a.method1(3);
        a.method1(1.2);
        a.method1(4.2, 3);
        a.method1(7.2, 8.64);
    }
}

class C07MyClass {
    // 파라미터의 갯수, 타입이 다른
    // 같은 이름의 메소드 작성 가능 // 오버로딩

    void method1(int a) {
    }

    void method1(double a) {
    }

    void method1(double a, double b) {
    }

    void method1(double a, int b) {
    }

}
