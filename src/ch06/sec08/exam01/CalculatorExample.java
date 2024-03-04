package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        myCal.powerOn();

        myCal.powerOff();

        int result1 = myCal.plus(2, 3);
        System.out.println("result1 = " + result1);

        double result2 = myCal.divide(2, 3);
        System.out.println("result2 = " + result2);
    }
}
