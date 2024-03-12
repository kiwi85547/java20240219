package ch09.lecture.p1nested;

public class C05EffectivelyFinal {
    void method(final int para) { // 파라미터도 final or effectively final
        // 로컬클래스에서 쓸거면
        int i = 3; // final or effectively final
        class LocalClass {
            void method() {
                System.out.println("i = " + i);
            }
        }
    }
}
