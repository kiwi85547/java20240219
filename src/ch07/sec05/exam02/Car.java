package ch07.sec05.exam02;

public class Car {
    public int speed;

    public void speedUp() {
        speed++;
    }

    final public void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}

class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    // 오버라이딩을 할 수 없음
//    @Override
//    public void stop() {
//        System.out.println("sportscar  차 멈춤");
//    }
}