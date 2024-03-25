package ch11.lecture.p2throw;

public class C02Throw {
    public static void main(String[] args) {
        someMethod1();
    }

    public static void someMethod1() {
//        RuntimeException e = new RuntimeException();
//        throw e;

        throw new RuntimeException(); // 위 코드와 같음
    }
}
