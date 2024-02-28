package ch05.lecture.p1array;

import java.util.Arrays;

public class C12Arrays {
    public static void main(String[] args) {
        // java.util.Arrays : 유틸리티 클래스
        // 구글에서 java 21 api 검색

        // toString : 배열을 보기 좋게 String으로 변환
        int[] arr1 = {4, 3, 5, 6, 8};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        // sort : 배열을 오름차순으로 정렬
        Arrays.sort(arr1); // 정렬 한 후 String으로 변환
        System.out.println(Arrays.toString(arr1));

        // fill : 특정값으로 배열 채우기
        int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr2));

        Arrays.fill(arr2, 10);
        System.out.println("fill" + Arrays.toString(arr2));

        // copyOf : 배열을 복사
        int[] arr3 = {5, 3, 4, 8, 9};
        int[] arr4 = arr3; // 같은 배열

        arr4[0] = 10;

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = {2, 5, 6, 9, 0};
        int[] arr6 = Arrays.copyOf(arr5, arr5.length);

        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));

        arr5[0] = 50;

        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));


    }
}
