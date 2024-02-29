package ch05.lecture.p2String;

import java.util.Arrays;

public class programmers_MultidimensionalArray {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        String answer = "";


        // 2차원 배열 값 꺼내기
        // 변수[1차원인덱스][2차원인덱스]
        // 2차원 배열 parts 의 길이는 4
        System.out.println("parts.length = " + parts.length);//4

        // 1차원 배열의 0 인덱스
        System.out.println(Arrays.toString(parts[0]));
        // 1차원 배열의 1 인덱스
        System.out.println(Arrays.toString(parts[1]));

        // 1차원 배열의 변수 생성
        System.out.println("-------------------------------");
        for (int i = 0; i < parts.length; i++) {
//            int[] part = parts[i];
//            System.out.println(Arrays.toString(part));
//            int start = part[0]; //2차원배열의 첫번째 원소를 integer타입으로 선언 후 대입
//            int end = part[1]; //2차원배열의 두번째 원소를 integer타입으로 선언 후 대입
//            System.out.println(start);
////            my_strings[0].substring()
            answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }
        System.out.println("answer = " + answer);


    }
}
