package ch06.lecture.p2method;

public class C01Method {
    public static void main(String[] args) {
        C01Person person1 = new C01Person();
        C01Person person2 = new C01Person();

        person1.name = "son";
        person2.name = "lee";

        person1.walk(); // 기능(메소드)실행
        person2.walk(); // 메소드 실행
    }
}

class C01Person {
    // 필드들이 있다고 생각하고 하겠음
    // 이름, 나이, 주소
    String name;

    // 기능(메소드)들...
    // 관습상 필드 다음 메소드
    void walk() {
        // 메소드가 실행하는 코드들
        // 2,3,4장에서 배운 내용들
        // 변수 선언과 할당, 연산자, 조건문 반복문(제어문)
        System.out.println(name + "이 걷습니다.");
    }

}