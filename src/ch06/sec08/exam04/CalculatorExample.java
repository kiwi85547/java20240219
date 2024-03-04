package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        //객체 생성
        Calculator calculator = new Calculator();

        int result1 = (int) calculator.areaRectangle(3);
        double result2 = calculator.areaRectangle(5, 2.64);
        System.out.println("수학메소드 = " + ((int) (Math.random() * 6) + 1));

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        System.out.println(calculator.areaRectangle(2, 3.14));


    }

}
