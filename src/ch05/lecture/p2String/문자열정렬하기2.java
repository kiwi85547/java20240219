package ch05.lecture.p2String;

import java.util.Arrays;

public class 문자열정렬하기2 {
    public static void main(String[] args) {

        String my_string = "Bcad";
        String my_string_Lower = my_string.toLowerCase();
        System.out.println("my_string_Lower = " + my_string_Lower);

        char[] my_string_sort = my_string_Lower.toCharArray();
        System.out.println(Arrays.toString(my_string_sort));
        Arrays.sort(my_string_sort);
        System.out.println(Arrays.toString(my_string_sort));
        String s1 = new String(my_string_sort);
        System.out.println("s1 = " + s1);

        // 강사님 코드
        String answer = "";
        // 소문자로 바꾸기
        String lower = my_string.toLowerCase();
        // 각 문자열 분리
        String[] characters = lower.split("");
        // 정렬
        java.util.Arrays.sort(characters); // java.util. 임포트
        System.out.println("characters = " + Arrays.toString(characters));
        for (String character : characters) {
            answer += character;
        }
        System.out.println("answer = " + answer);
    }
}
