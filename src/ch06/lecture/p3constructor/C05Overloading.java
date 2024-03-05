package ch06.lecture.p3constructor;

public class C05Overloading {
    public static void main(String[] args) {
        C05MyClass o1 = new C05MyClass("son", 44);
        System.out.println(o1.name);
        System.out.println(o1.age);
        C05MyClass o2 = new C05MyClass("화영");
        System.out.println(o2.name);
        System.out.println(o2.age);
        C05MyClass o3 = new C05MyClass();
        System.out.println(o3.name);
        System.out.println(o3.age);
    }
}

class C05MyClass {
    String name;
    int age;

    // 파라미터의 타입, 갯수가 다르면 다른 생성자임
    C05MyClass(String initialName, int initialAge) {
        name = initialName;
        age = initialAge;
    }

    C05MyClass(String initialName) {
        name = initialName;
    }

    C05MyClass() {
        name = "홍길동";
        age = 16;
    }
}
