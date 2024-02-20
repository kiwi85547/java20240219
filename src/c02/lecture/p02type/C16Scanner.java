package c02.lecture.p02type;

import java.util.Scanner;

public class C16Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("입력값 = " + line);

        System.out.println("이름을 입력하세요.");
        String name = scanner.nextLine();


        String desc = STR."저는 \{name}입니다.";
        System.out.println("소개 = " + desc);


        scanner.close();
    }
}
