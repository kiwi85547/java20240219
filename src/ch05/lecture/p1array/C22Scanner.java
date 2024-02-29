package ch05.lecture.p1array;

import java.util.Scanner;

public class C22Scanner {
    public static void main(String[] args) {
        String s = "My age is 33 or 35";
        Scanner scanner = new Scanner(s);
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.nextInt());

        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println("token = " + token);
            scanner.next();
        }

        if (scanner.hasNext()) { // 다음 토큰이 있니?
            String token1 = scanner.next();
            System.out.println("token1 = " + token1);
        } else {
            System.out.println("없음");
        }

        String a = """
                Wow good job 10
                """;
        Scanner scanner1 = new Scanner(a);
        String str1 = scanner1.next();
        System.out.println(str1);
    }
}
