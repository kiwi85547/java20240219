package ch04.lecture.p4for;

public class FloatCounterExample {
    public static void main(String[] args) {
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println("x = " + x);
        }
    }
}
