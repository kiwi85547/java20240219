package ch09.lecture.p2anonymous;

public class C02AnonymousClass {
    public static void main(String[] args) {
        C02Parent obj = new C02Parent() {
            // 상속된 멤버 // 우리 눈엔 안보이지만..

            // 필요하면 재정의 가능
            @Override
            void method() {
                System.out.println("C02AnonymousClass.method");
            }
        };
        obj.method();
    }
}

abstract class C02Parent {
    void method() {
        System.out.println("C02Parent.method");
    }
}

//재정의한 내용이 실행
