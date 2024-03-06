package ch06.exercise.p20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[100];

        boolean run = true;
        while (run) {
            System.out.print("""
                    ----------------------------------------------
                    1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
                    ----------------------------------------------
                    선택>  """);
            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("""
                        ---------------
                        계좌생성
                        ---------------""");
                System.out.print("계좌번호 :");
                String num = scanner.nextLine();
                System.out.print("계좌주 :");
                String name = scanner.nextLine();
                System.out.print("초기입금액 :");
                int balance = Integer.parseInt(scanner.nextLine());
                System.out.println("결과: 계좌가 생성되었습니다.");

                Account account = new Account();


            } else if (input.equals("2")) {
                System.out.println("""
                        ---------------
                        계좌목록
                        ---------------
                        """);

            } else if (input.equals("3")) {
                System.out.println("""
                        ---------------
                        예금
                        ---------------""");
                System.out.print("계좌번호: ");
                String num = scanner.nextLine();
                System.out.print("예금액: ");
                int deposit = Integer.parseInt(scanner.nextLine());

            } else if (input.equals("4")) {
                System.out.println("""
                        ---------------
                        출금
                        ---------------""");
                System.out.print("계좌번호: ");
                System.out.print("출금액: ");
                System.out.println("결과: 출금이 성공되었습니다.");

            } else if (input.equals("5")) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}

class Account {
    private String number; // 계좌번호
    private String name; // 계좌주
    private int balance; // 잔액

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}