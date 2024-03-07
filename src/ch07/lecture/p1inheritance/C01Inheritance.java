package ch07.lecture.p1inheritance;

public class C01Inheritance {
    public static void main(String[] args) {
        C01Child child = new C01Child();
//        child.name = "G";
//        System.out.println(child.name);
        child.method1();
    }
}

class C01Parent {
    // 필드
    // 메소드

    // 보통 필드는 private임.
    private String name;

    public void method1() {
        System.out.println("C01Parent.method1");
    }
}

// extends : 부모의 멤버를 이 클래스에 상속함
class C01Child extends C01Parent {

}