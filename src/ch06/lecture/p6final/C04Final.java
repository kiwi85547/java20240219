package ch06.lecture.p6final;

public class C04Final {
    public static void main(String[] args) {
        C04MyClass.i = 2;
    }
}

class C04MyClass {
    static int i;

    // final static field
    // final static field 작명 관습 : UPPER_SNAKE_CASE
    final static int AMOUNT_OF_MONEY = 20;
    static final int L = 40; // 이것도 가능

    final static int J;

    static {
        J = 30;
    }
}