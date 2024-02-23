package ch04.lecture.p3while;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        // 메시지를 입력받고, 입력받은 내용이 q가 아닌 경우 계속 메시지 입력받음

        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while (!inputString.equals("q")); //조건식이 true인 동안 실행. false이면 do-while문 빠져나옴

        System.out.println("프로그램 종료");


    }
}
