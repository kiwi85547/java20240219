package ch16.lecture.p1lambda;

public class C08Lambda {
    public static void main(String[] args) {
        A o = () -> System.out.println("C08Lambda.method");
    }
}

@FunctionalInterface
interface A {
    void method();
}