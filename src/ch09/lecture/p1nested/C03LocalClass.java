package ch09.lecture.p1nested;

public class C03LocalClass {

    // 중첩 클래스
    // 필드
    // 생성자
    // 메소드
    void method1() {
        // 메소드 안에서 중첩클래스
        // 메소드 안에서만 사용가능
        class LocalClass {
            LocalClass ob = new LocalClass();
        }
    }
}
