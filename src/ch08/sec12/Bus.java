package ch08.sec12;

import ch07.sec11.exam02.Vehicle;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus.run");
    }

    public void checkFare() {
        System.out.println("Bus.checkFare");
    }
}
