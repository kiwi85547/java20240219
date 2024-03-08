package ch07.sec04.exam02;

import ch06.sec13.exam02.package1.A;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.land();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}

class Airplane {
    public void land() {
        System.out.println("착륙합니다");
    }

    public void fly() {
        System.out.println("fly");
    }

    public void takeOff() {
        System.out.println("이륙");
    }
}

class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    public int flyMode;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행");
        } else {
            super.fly();
        }
    }
}