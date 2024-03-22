package ch17.lecture.p1stream;

import java.util.List;

public class C11Reduce {
    public static void main(String[] args) {
        // reduce : reduction 최종 연산
        // 하나의 데이터로 요약??
        // IntStream sum,average
        // reduction 연산 : 하나로 만들어내는..

        // 고전적 방법
        List<String> list = List.of("java", "css", "spring", "html");

        // "javacssspringhtml" 출력하고 싶으면
        String result1 = ""; // 초기값
        for (String s : list) {
            result1 += s;   // apply 메소드. 두개의 값 필요
            // 직전 값, 현재 값
        }
        System.out.println(result1);

        //sum처럼 해보자
        List<Integer> list1 = List.of(3, 6, 9, 10);
        int sum1 = 0;
        for (Integer i : list1) {
            sum1 += i;
        }
        System.out.println(sum1);


        // stream 활용
        // reduce. 세개의 메소드로 오버로딩 되어있음
        // 외우지 말고, api 보기!

        // apply
        // 여러 엘레멘트들을 묶어줌
        // identity : 초기값
        String result2 = list.stream()
                .reduce("", (result, e) -> result + e);
        System.out.println("result2 = " + result2);

        Integer sum2 = list1.stream()
                .reduce(0, (s, v) -> s + v);
        System.out.println("sum2 = " + sum2);


    }
}
