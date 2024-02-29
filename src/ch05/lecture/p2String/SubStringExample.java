package ch05.lecture.p2String;

import java.util.Arrays;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";
        String firstnum = ssn.substring(0, 6);
        System.out.println("firstnum = " + firstnum);
        String secondNum = ssn.substring(7);
        System.out.println("secondNum = " + secondNum);

        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        System.out.println("parts.length = " + parts.length);

        String answer = "";
        String result1 = my_strings[0].substring(0, 5);
        String result2 = my_strings[1].substring(1, 3);
        System.out.println(result1);
        System.out.println(result2);

        for (int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            int[] part = parts[i];
            int start = part[0];
            int end = part[1];

            String sub = str.substring(start, end + 1);
            answer += sub;
            System.out.println("part = " + Arrays.toString(part));
        }

        System.out.println("answer = " + answer);

    }


}
