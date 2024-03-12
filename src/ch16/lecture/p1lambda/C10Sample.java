package ch16.lecture.p1lambda;

import java.util.*;

public class C10Sample {
    public static void main(String[] args) {
        String[] names = {"son", "park", "hwang"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, (a, b) -> b.length() - a.length());
        System.out.println(Arrays.toString(names));


        Solution.solution(new String[]{"sun", "bed", "car"}, 1);

    }
}

// 3/13 3시30분 수업
// 프로그래머스 : 문자열 내 마음대로 정렬하기

// 문자열의 사전순(코드순 비교)
// String.compareTo
class Solution {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (x, y) -> {
            if (x.charAt(n) == y.charAt(n)) {
                return x.compareTo(y);
            } else {
                return x.charAt(n) - y.charAt(n);
            }
        });
        return strings;
    }
}