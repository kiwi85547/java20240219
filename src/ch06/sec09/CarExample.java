package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐");
        Car yourCar = new Car("벤츠");
        myCar.run();
        yourCar.run();
    }
}

class Car {
    String model;
    int speed;

    Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100); // this 생략 가능
        System.out.println(this.model + "이 달립니다. " + "(시속:" + this.speed + "km/h)"); // this 생략 가능
    }
}