package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(-50);
        System.out.println("현재 속도 = " + car.getSpeed());

        car.setSpeed(100);
        System.out.println("현재 속도 = " + car.getSpeed());

        if (!car.isStop()) {
            car.setStop(true);
        }
        System.out.println("stop? " + car.getSpeed());
    }
}

class Car {
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop == true) this.speed = 0;
    }
}