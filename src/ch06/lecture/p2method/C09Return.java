package ch06.lecture.p2method;

import java.util.Random;

public class C09Return {
    public static void main(String[] args) {
        C09MyClass obj = new C09MyClass();
        obj.method2();
    }
}

class C09MyClass {
    void method1() {
        // return :
        // 1. 메소드 종료
        // 2. 메소드가 호출된 곳으로 값 반환
        //    이 때, 반환되는 값의 타입이 메소드의 타입과 일치해야함

        System.out.println("statement 1");
        System.out.println("statement 2");

        return; // 메소드 종료. void이므로 쓸모 없음

//        System.out.println("3"); // 실행되지 않음
    }

    void method2() {
        Random random = new Random();
        while (true) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            System.out.println("dice1 = " + dice1);
            System.out.println("dice2 = " + dice2);
            System.out.println(dice1 + dice2); // dice1+dice2 하면 두 숫자가 더해지는 것 같다. 왜지?
            // +연산자는 피연산자가 모두 숫자일 경우 덧셈 연산을 수행, 피연산자 중 하나가 문자열일 경우,
            // 나머지 피연산자도 문자열로 자동 변환되어 문자열 결합 연산 수행
            System.out.println("result : " + dice1 + dice2); // 문자열을 추가하면  dice1, dice2가 문자열로 인식된다.
            if (dice1 == dice2) {
                break;
//                 return; 써도 됨
            }
        }
    }


}