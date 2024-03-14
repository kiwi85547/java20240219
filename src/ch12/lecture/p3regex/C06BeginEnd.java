package ch12.lecture.p3regex;

import java.util.Scanner;

public class C06BeginEnd {
    public static void main(String[] args) {
        // ^ (caret) 시작
        // $ : 끝

        String s1 = ",,abc,def,,,xyz,,,,,";
        String s = s1.replaceAll(",+", "");
        System.out.println("s = " + s);

        String s2 = s1.replaceAll("^", "hi");
        System.out.println("s2 = " + s2);
        String s3 = s1.replaceAll("^,+", "");
        System.out.println("s3 = " + s3);
        String s4 = s1.replaceAll("$", "hi");
        System.out.println("s4 = " + s4);
        String s5 = s1.replaceAll(",+$", "");
        System.out.println("s5 = " + s5);

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(n));

    }
}