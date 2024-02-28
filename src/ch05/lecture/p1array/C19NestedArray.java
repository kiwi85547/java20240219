package ch05.lecture.p1array;

import java.util.Arrays;

public class C19NestedArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][];
        System.out.println(arr1.length);
        System.out.println(Arrays.toString(arr1)); //[null],[null] 출력됨. 그럼 2차원 배열은 열인가???? No.
        // 참조타입의 배열은 초기값이 null. 기본타입 배열은 초기값이 0

        arr1[0] = new int[3];
        System.out.println(Arrays.toString(arr1)); //[[I@b4c966a, null] 첫번째 이상한 문자는 12장에서 배울 예정
        System.out.println(Arrays.toString(arr1[0])); // [0,0,0]

        // 프로그래머스 문제
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        int s1l = s1.length;
        int s2l = s2.length;
        int answer = 0;
        for (int i = 0; i < s1l; i++)
            for (int j = 0; j < s2l; j++)
                if (s1[i].equals(s2[j]))
                    answer++;
        System.out.println("answer = " + answer);


    }
}
