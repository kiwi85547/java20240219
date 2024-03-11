package ch08.lecture.p1interface;

public class C06StaticMethod {
    public static void main(String[] args) {
        C06MyInterface.method1();
        // static이기 때문에 객체 생성 없이 바로 메소드 작성 가능
    }
}

interface C06MyInterface {
    // field (public static final)
    // abstract method (public abstract)
    // default method (public instance)

    // static method (public static)
    // 몸통이 꼭 있어야 함
    static void method1() {
        System.out.println("C06MyInterface.method1");
    }

    ;
}