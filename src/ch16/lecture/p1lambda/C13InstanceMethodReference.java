package ch16.lecture.p1lambda;

import java.util.List;

//  2. instance method 참조
public class C13InstanceMethodReference {
    public static void main(String[] args) {
        C13OtherClass obj1 = new C13OtherClass();
        C13MyInterface lambda1 = (i, j) -> obj1.someMethod(i, j);
        C13MyInterface lambda2 = obj1::someMethod;

        List.of(9, 10, 3, 23, 7).forEach(System.out::println);
        // 뭔지 도통....
    }
}

class C13OtherClass {
    void someMethod(int a, int b) {
        System.out.println("C13OtherClass.someMethod");
    }
}

@FunctionalInterface
interface C13MyInterface {
    void method(int x, int y);
}