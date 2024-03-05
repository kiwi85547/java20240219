package ch06.lecture.p3constructor;

public class C02Constructor {
    public static void main(String[] args) {
        C02MyClass obj = new C02MyClass();
        System.out.println(obj.age);
    }
}

class C02MyClass {
    int age;

    C02MyClass() {
        age = 33;
    }


}