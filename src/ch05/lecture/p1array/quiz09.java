package ch05.lecture.p1array;

import java.util.Scanner;

public class quiz09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int studentOfNumber = 0;
        while (run) {
            System.out.print("------------------------------------------------------\n" +
                    "1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료\n" +
                    "------------------------------------------------------\n" + "선택> ");

            String num = scanner.nextLine();
            switch (num) {
                case "1" -> {
                    System.out.print("학생수> ");
                    studentOfNumber = Integer.parseInt(scanner.nextLine());
                    continue;
                }
                case "2" -> {
                    for (int i = 0; i < studentOfNumber; i++) {
                        System.out.print("scores[" + i + "]");
                    }
                    ;
                }
                case "3" -> {
                    System.out.println(3);
                }
                case "4" -> {
                    System.out.println(4);
                }
                case "5" -> {
                    System.out.println("프로그램 종료");
                    run = false;
                }

            }

            scanner.close();


        }


    }
}
