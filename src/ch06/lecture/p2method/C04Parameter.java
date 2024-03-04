package ch06.lecture.p2method;

public class C04Parameter {
    public static void main(String[] args) {
        C04Calculator cal = new C04Calculator();
        cal.printSum(9, 13); //아규먼트, 인수
        cal.printSum(10, 14); //아규먼트

        cal.printDivide(3.14, 0.5);
        cal.printDivide(9.0, 3);
        cal.printDivide(10, 2); // 자동 형변환?
    }
}

class C04Calculator {
    // 필드들...
    // 메소드들...
    void printSum(int a, int b) { //파라미터
        int result = a * b;
        System.out.println("result = " + result);
    }

    void printDivide(double a, double b) {
        double div = a / b;
        System.out.println("div = " + div);
    }

}
