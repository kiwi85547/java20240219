package ch05.lecture.p1array;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        // 배열 변수 선언과 배열 생성
        String[] arr = {"Spring", "Summer", "Fall", "Winter"};
        arr[1] = "여름";
        System.out.println("season[1] = " + arr[1]);

        // 배열 변수 선언과 배열 생성
        int[] score = {83, 90, 87};
        int sum = 0;
        // 총합과 평균 구하기
        for (int score1 : score) {
            sum += score1;
        }
        System.out.println("sum = " + sum);
        System.out.println("평균 = " + (double) sum / score.length);

        //

    }
}
