package ch06.lecture.p2method;

public class C10Return {
    public static void main(String[] args) {
        C10MyClass o = new C10MyClass();
        o.method1();
        System.out.println(32 / o.method2()); // 메소드를 연산식 중간에도 사용 가능하다
        double a = o.method1() * 9.81;
        System.out.println(a);
        System.out.println(o.method3());

    }
}

class C10MyClass {

    int method1() {
        return 2;
    }

    double method2() {
        return 6;
    }

    String method3() {
        return "Go";
    }
}
