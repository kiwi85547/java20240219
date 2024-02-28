package ch05.lecture.p1array;

import java.util.Arrays;

public class quiz08foreach {
    public static void main(String[] args) {
        int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}}; // 원소 또는 요소
        double sum = 0;
        int cnt = 0;
        for (int[] row : array) //':'를 기준으로 우변 : 탐색할 배열, 좌변 : 탐색할 배열의 원소가 들어갈 변수 선언
        {                       // array안에 있는 원소의 갯수는 3개
            System.out.println(Arrays.toString(row)); // 각 원소가 배열이므로 [95,86] 출력
            for (int element : row) {
                sum += element;
                cnt++;
                System.out.println(element);
            }
        }
        System.out.println("sum = " + sum);
        double avg = sum / cnt;
        System.out.println("avg = " + avg);
    }
}
