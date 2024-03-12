package ch09.sec03.exam02;

public class A {
    static class B {
        int field1 = 1;
        static int field2 = 2;

        B() { // B 생성자
            System.out.println("B.B");
        }

        void method1() {
            System.out.println("B.method1");
        }

        static void method2() {
            System.out.println("B.method2");
        }
    }
}

class AExample {
    public static void main(String[] args) {
        A.B b = new A.B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(A.B.field2);
        A.B.method2();
    }
}