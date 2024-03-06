package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-20);
        System.out.println(myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println(myCar.getSpeed());

        if (myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println(myCar.getSpeed());
    }
}

class Car {
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int Speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
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