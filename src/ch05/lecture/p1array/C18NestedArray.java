package ch05.lecture.p1array;

import java.util.Arrays;

public class C18NestedArray {
    public static void main(String[] args) {
        // 1차원 배열
        // 원소가 5개인 배열
        // 원소의 타입이 int
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));

        // 2차원 배열
        // 원소가 3개인 배열
        // 원소의 타입이 int[]. 참조타입
        int[][] arr2 = new int[3][];
        System.out.println(Arrays.toString(arr2));

        arr2[0] = new int[2];
        arr2[1] = new int[4];
        arr2[2] = new int[3]; //각 원소의 길이 같으면 행렬, 다르면 행렬 아님

        System.out.println(arr2[0].length);

        // 초기값을 지정해서 배열 만들기
        int[] arr3 = new int[]{8, 3, 2};
        int[] arr4 = {8, 3, 2};

        // 2차원 배열
        int[][] arr5 = new int[][]{{8, 3, 2}, {1, 2, 3}, {6, -54, 7, 0}};
        int[][] arr6 = {{8, 3, 2}, {1, 2, 3}, {6, -54, 7, 0}}; // new 연산자 빼도 됨

        int[][] arr7 = new int[3][];
        arr7[0] = new int[]{5, 4, 3};
        arr7[1] = new int[]{2};
//        arr7[2] = {2}; // 불가능. 처음에 배열을 선언하였기 때문
        arr7[2] = new int[]{22, 33, 44, 55, 66};
    }
}
