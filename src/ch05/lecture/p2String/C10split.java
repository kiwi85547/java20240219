package ch05.lecture.p2String;

import java.util.Arrays;

public class C10split {
    public static void main(String[] args) {
        // split :
        // 이 문자열을 주어진 정규 표현식(regular expressions)과 일치하는 부분
        // 패턴을 넣고 싶을때... 12장에서
        // 문자열을 쪼갠다

        String s1 = "hello wolrd";
        String[] words1 = s1.split(" "); // " "를 기준으로 두 부분으로 나눈 것을 배열 words1로 정함
        // 문자열은 아님

        System.out.println(words1.length);
        System.out.println("words1[0] = " + words1[0]);
        System.out.println("words1[1] = " + words1[1]);

        String s2 = "css,react,html,spring";
        String[] words2 = s2.split(",");
        System.out.println(Arrays.toString(words2)); // [css, react, html, spring]

        String s3 = "spring";
        String[] words3 = s3.split("");
        System.out.println(Arrays.toString(words3)); //[s, p, r, i, n, g]

        String s4 = "html,css, react";
        String[] words4 = s4.split(",\\s*"); //책 12.10
        System.out.println(Arrays.toString((words4))); // [html,css, react]


    }
}
