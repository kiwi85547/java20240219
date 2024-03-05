package ch06.lecture.p3constructor;

public class C06This {
    public static void main(String[] args) {
        C06MyClass o1 = new C06MyClass("cho");
        o1.name = "a";
        System.out.println(o1.name);

        C06MyClass o2 = new C06MyClass("kim");
        System.out.println(o2.name);
    }
}

class C06MyClass {
    // this : 아직 생성되지 않은 현재 객체의 참조값
    String name;

    C06MyClass(String name) {
        this.name = name; // this를 사용하면 필드값과 파라미터값을 같은 이름을 써도 구분이 됨

    }
}