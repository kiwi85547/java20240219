package ch04;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        int money = 0;

        while (run) {
            System.out.print("""
                    -------------------------------------
                    1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
                    -------------------------------------
                    선택>""");
            String str = scanner.nextLine();

            switch (str) {
                case "1" -> {
                    System.out.print("예금액>");
                    String depositString = scanner.nextLine();
                    int deposit = Integer.parseInt(depositString);
                    money += deposit;
                }
                case "2" -> {
                    System.out.print("출금액>");
                    String withdrawalString = scanner.nextLine();
                    int withdrawal = Integer.parseInt(withdrawalString);
                    money -= withdrawal;
                }
                case "3" -> System.out.println(STR."잔고>\{money}");
                case "4" -> run = false;
            }
        }
        System.out.println("프로그램 종료");
        scanner.close();
    }
}
