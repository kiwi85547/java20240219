package ch05.lecture.p1array;

import java.util.Arrays;

public class C16Null {
    public static void main(String[] args) {
        // 배열 원소의 기본값은 0, null
        int[] arr1 = new int[3];
        System.out.println(Arrays.toString(arr1));

        double[] arr2 = new double[2];
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = new String[4];
        System.out.println(Arrays.toString(arr3));

        int[][] arr4 = new int[5][];
        System.out.println(Arrays.toString(arr4));

        // 2차원 배열(matrix)
        // 원소의 타입이 int[]
        int[][] arr5 = new int[3][];
        System.out.println(Arrays.toString(arr5));

        // 원소의 타입이 double[]
        double[][] arr6 = new double[1][];
        System.out.println(Arrays.toString(arr6));


        // 3차원 배열도 존재


    }
}
