package ch06.lecture.p3constructor;

public class C08This {
    public static void main(String[] args) {
        C08MyClass obj = new C08MyClass();
        System.out.println("obj.name = " + obj.name);
        System.out.println("obj.age = " + obj.age);
        System.out.println("obj.address = " + obj.address);
        C08MyClass obj2 = new C08MyClass("2");
    }
}

class C08MyClass {
    // 필드
    String name;
    int age;
    String address;
    // 생성자

    public C08MyClass(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public C08MyClass(String name) {
//        this.name = name;
        this(name, 3, "B234");
    }

    public C08MyClass() {
//        this.name="hong";
//        this.age=11;
//        this.address="없음";
        this("hy", 2, null);
    }
}