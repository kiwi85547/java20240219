package ch08.lecture.p1interface;

public interface C07PrivateMethod {
    // public static final field
    // public abstract instance method
    // public default method
    // private instance method

    // public static method
    // private static method

    default void method1() {
        System.out.println("C07PrivateMethod.method1");
        System.out.println("두 메소드의 중복된 코드");
    }

    default void method2() {
        System.out.println("C07PrivateMethod.method2");
        System.out.println("두 메소드의 중복된 코드");
    }

    // private instance method
    // 꼭 몸통이 있어야 함
    // extract한 것을 public으로 만들고 싶지 않아서 만들었음...


    static void method3() {
        System.out.println("C07PrivateMethod.method3");
        doCommon();
    }

    static void method4() {
        System.out.println("C07PrivateMethod.method4");
        doCommon();
    }

    private static void doCommon() { // public -> private
        System.out.println("두 스태틱 메소드의 중복된 코드");
    }
}
