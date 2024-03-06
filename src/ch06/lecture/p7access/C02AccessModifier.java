package ch06.lecture.p7access;

public class C02AccessModifier {
    public static void main(String[] args) {
        C01MyClass obj = new C01MyClass();
        obj.method1();
        obj.age = 40;
        obj.method1();
//        obj.address
    }
}
