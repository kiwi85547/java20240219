package ch06.sec10;

class Calculator {
    static double pi = 3.141592;
}

public class CalculatorExample {
    public static void main(String[] args) {
        double result = 10 * 10 * Calculator.pi;
        System.out.println("result = " + result);
    }
}
