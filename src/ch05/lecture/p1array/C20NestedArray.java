package ch05.lecture.p1array;

import java.util.Arrays;

public class C20NestedArray {
    public static void main(String[] args) {
        // 07. 2차원 배열
        int[] arr1 = {5, 8, 9};
        int[][] arr2 = {{0, 2, 1}, {3, 4}};

        int[][] arr3 = arr2;

        arr3[1] = arr1;
        System.out.println(arr2[1][1]);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[1][0]);


    }

}
