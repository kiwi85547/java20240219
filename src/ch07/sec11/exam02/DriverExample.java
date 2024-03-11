package ch07.sec11.exam02;

import ch08.sec10.exam01.D;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(bus);
    }
}
