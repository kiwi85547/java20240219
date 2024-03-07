package ch07.sec08.exam02;

class Vehicle {
    public void run() {
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}

class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}

class Driver {
    // 메소드 선언(클래스 타입의 매개변수를 가지고 있음)
    public void drive(Vehicle vehicle) {
        vehicle.run();
    }
}

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus); // driver.drive(new Bus());와 동일

        Taxi taxi = new Taxi();
        driver.drive(taxi); // driver.drive(new Taxi());와 동일
    }
}