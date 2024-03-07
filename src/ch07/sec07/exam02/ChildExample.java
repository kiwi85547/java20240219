package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1(); // 가능
        child.method2(); // 가능
        child.method3(); // 가능

        Parent parent = child;

        parent.method1(); // 가능
        parent.method2(); // 가능
//        parent.method3(); //불가능
    }
}
