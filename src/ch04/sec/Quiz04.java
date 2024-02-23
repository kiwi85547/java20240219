package ch04.sec;

public class Quiz04 {
    public static void main(String[] args) {
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            System.out.println(STR."(\{num1}),(\{num2})"); // 5일 때 출력함
            if (num1 + num2 == 5)
                break;
//            System.out.println(STR."(\{num1}),(\{num2})"); // 5일 때 출력 안함
        }
        System.out.println("두 눈의 합이 5가 되었습니다");
        System.out.println("프로그램 종료");
    }
}
