package ch11.lecture.p2throw;

public class C04Throw {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            // 던지는 곳의 클래스보다
            // 받는 곳의 클래스가 같거나 상위타입이어야 함
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        throw new ClassNotFoundException();
    }
}
