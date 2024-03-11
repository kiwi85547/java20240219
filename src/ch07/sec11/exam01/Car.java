package ch07.sec11.exam01;

public class Car {
    Tire tire1 = new HankookTire();
    Tire tire2 = new KumhoTire();

    void run() {
        // 한국인지 금호인지 상관없음. roll메소드만 있으면 됨
        tire1.roll();
        tire2.roll();
    }
}
