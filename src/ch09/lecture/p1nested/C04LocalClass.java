package ch09.lecture.p1nested;

public class C04LocalClass {
    void method1() {
        final int j = 67;
        int k = 5; // final로 취급 (effectively final)
        // 값을 변경하면 localclass에서 못 씀
        class LocalClass {
            void method1() {
                int i = 0;
                System.out.println("i = " + i);
                i = 2;
                // 감싸고 있는 메소드의 final 지역변수만 사용 가능
                System.out.println("j = " + j);
//                j=3; // x 감싸고 있는 메소드의 변수의 값 변경하면 안됨
            }
        }
    }
}
