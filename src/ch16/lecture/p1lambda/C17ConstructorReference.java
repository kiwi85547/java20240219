package ch16.lecture.p1lambda;

public class C17ConstructorReference {
    public static void main(String[] args) {
        C17MyInterface obj1 = C17Myclass::new;
        C17MyInterface2 obj2 = (s, i) -> new C17Myclass();
    }
}

class C17Myclass {
}

@FunctionalInterface
interface C17MyInterface {
    C17Myclass method();
}

@FunctionalInterface
interface C17MyInterface2 {
    C17Myclass method(String s, int i);
}
