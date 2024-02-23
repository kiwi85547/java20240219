package ch04.lecture.p2switch;

import java.util.Scanner;

public class C05Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String Scanner = scanner.nextLine();

        switch (Scanner) {
            case "A", "a" -> System.out.println("우수회원");
            case "B", "b" -> System.out.println("일반회원");
            default -> System.out.println("손님");
        }

    }
}

