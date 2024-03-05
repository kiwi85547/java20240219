package ch06.lecture.p5static;

public class C04Static {
}

class C04MyClass {
    // 인스턴스 필드
    String name;

    // static(정적) 필드
    static String location;

    // 인스턴스 메소드
    void method1() {
        System.out.println("name = " + name);
        System.out.println("location = " + location);
    }

    // static(정적) 메소드
    static void method2() {
        // static 멤버에서 인스턴스 멤버에 접근하지 못함
        System.out.println("location = " + location);
        // 인스턴스 멤버에서 static 멤버에 접근 가능
//        System.out.println(name); // x 어느 인스턴스에 접근하는지 알 수 없으므로
    }

}