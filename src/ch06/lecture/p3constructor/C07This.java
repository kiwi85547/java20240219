package ch06.lecture.p3constructor;

public class C07This {
    public static void main(String[] args) {
        C07MyClass obj = new C07MyClass();
        System.out.println(obj.name);
        obj.method1();
        System.out.println();
    }
}

class C07MyClass {
    String name;
    int age;

    void method1() {
        System.out.println(name);
        System.out.println(this.name);
        method2(2);
        System.out.println(age);
        this.method2(3);
        System.out.println(this.age);
        System.out.println(age);
    }

    void method2(int age) {
        this.age = age;
    }
}