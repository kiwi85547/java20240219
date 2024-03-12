package ch16.lecture.p1lambda;

//1. 매개변수가 2개 이상 있고 리턴이 없는 추상 메소드
//2. 매개변수가 1개 있고 리턴이 없는 추상 메소드
//3. 매개변수가 없고 리턴이 없는 추상 메소드
//4. 리턴이 있는 추상 메소드
public class C04Lambda {
    //1. 매개변수가 2개 이상 있고 리턴이 없는 추상 메소드
    public static void main(String[] args) {
        // 람다 표현식
        C04MyInterface obj = (int a, int b) -> {
            System.out.println("메소드 몸통");
            System.out.println(a + b);
        };
        // 매개변수 타입 생략 가능
        C04MyInterface obj2 = (a, b) -> {
            System.out.println(a * b);
            System.out.println("여러줄");
        };
        // 한줄이면 중괄호 생략 가능
        C04MyInterface obj3 = (a, b) -> System.out.println(a / b);
        obj.method(2, 3);
        obj2.method(4, 2);
        obj3.method(2, 1);
    }
}

interface C04MyInterface {
    void method(int a, int b);
}