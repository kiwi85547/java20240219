package ch09.lecture.p2anonymous;

public class C04AnonymousClass {
    public static void main(String[] args) {
        C04Parent obj = new C04Child();
        obj.method();

        // 인스턴스 생성과 상속까지 한번에

    }
}

class C04Parent {
    void method() {
        System.out.println("C04Parent.method");
    }
}

class C04Child extends C04Parent {
    @Override
    void method() {
        System.out.println("C04Child.method");
    }
}