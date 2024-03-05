package ch06.lecture.p5static;

public class C01Static {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.name = "ssn";
        C01MyClass o2 = new C01MyClass();
        o2.name = "lee";

        // 인스턴스 즉 참조변수로 static 멤버(필드,메소드) 사용하는 것을 권장하지 않음
//        o1.location = "seoul";
        C01MyClass.location = "seoul";

        System.out.println("o1.name = " + o1.name);
        System.out.println("o1.name = " + o1.name);
        System.out.println("o2 = " + o1.location);
        System.out.println("o2 = " + o2.location);

//        static 메소드는 class로 접근해서 실행시키는 것을 권장
//        o1.method2();
        C01MyClass.method2();

    }
}

class C01MyClass {
    // 인스턴스 필드(인스턴스 변수) 보통 그냥 필드
    String name;

    // static 필드 (class 변수)
    // instance에 대한 정보가 아니라 class에 대한 정보
    static String location;

    // 인스턴스 메소드(각 인스턴스가 가지고 있는 기능)
    static void method2() {
    }
}
