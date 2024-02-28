package ch05.lecture.p1array;

import java.util.Arrays;

public class C13Reference {
    public static void main(String[] args) {
        // 참조타입 (배열 복사 예제)
        int[] arr1 = {5, 4};
        int[] arr2 = arr1;

        arr1[0] = 10;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));

        int[] arr3 = {2, 3};
        int[] arr4 = Arrays.copyOf(arr3, 5);

        arr3[0] = 10;
        System.out.println("arr3[0]:" + arr3[0]);
        System.out.println("arr4[0]:" + arr4[0]);

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));


        System.out.println(System.identityHashCode(arr3));
        System.out.println(System.identityHashCode(arr4));


    }
}
