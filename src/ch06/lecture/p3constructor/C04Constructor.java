package ch06.lecture.p3constructor;

public class C04Constructor {
    public static void main(String[] args) {
        C04MyClass obj1 = new C04MyClass("son", 32);
        System.out.println(obj1.name + " , " + obj1.age);
    }
}

class C04MyClass {
    String name;
    int age;

    C04MyClass(String initialName, int initialAge) {
        name = initialName;
        age = initialAge;
    }
}