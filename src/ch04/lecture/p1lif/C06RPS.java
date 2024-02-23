package ch04.lecture.p1lif;

import java.util.Scanner;
import java.util.Random;

public class C06RPS {
    public static void main(String[] args) {
        // 가위바위보 게임 만들기
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("가위(1), 바위(2), 보(3) 를 선택하세요 : ");

        // 사용자값은 입력값으로 받기. 컴퓨터값은 1~3사이의 랜덤값으로 정하기
        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(1, 4);

        // 1,2,3 값 안에서만 실행하기. 아니면 안내문 나오기
        if (user > 0 && user <= 3) {

            // 삼항연산자 사용하여 가위(1), 바위(2), 보(3) 알려주기
            String userChar, computerChar;
            userChar = (user == 1) ? "가위✌\uFE0F" : (user == 2) ? "바위✊" : "보✋";
            System.out.println("당신은 " + userChar + "을 선택하였습니다.");
            computerChar = (computer == 1) ? "가위✌\uFE0F" : (computer == 2) ? "바위✊" : "보✋";
            System.out.println("컴퓨터는 " + computerChar + "를 선택했습니다.");

            //누가 이겼는지 알려주기
            if (user == computer)
                System.out.println("비겼습니다.");
            else if ((user == 1 && computer == 3) | (user == 2 && computer == 1) | (user == 3 && computer == 2))
                System.out.println("당신이 이겼습니다");
            else
                System.out.println("컴퓨터가 이겼습니다");
        } else
            System.out.println("1,2,3 중에 입력해주세요");

    }
}
