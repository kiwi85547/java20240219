package ch05.lecture.p1array;

import java.util.Scanner;

public class C21Scanner {
    public static void main(String[] args) {
        String str = "My name is Hy.";
        Scanner scanner = new Scanner(str); // System.in 은 키보드 입력

        String token1 = scanner.next();
        String token2 = scanner.next();
        String token3 = scanner.next();
        String token4 = scanner.next();

        System.out.println("token1 = " + token1);
        System.out.println("token2 = " + token2);
        System.out.println("token3 = " + token3);
        System.out.println("token4 = " + token4);

        // String token5 = scanner.next();
        // System.out.println("token5 = " + token5); // next token이 없을 때
    }
}
