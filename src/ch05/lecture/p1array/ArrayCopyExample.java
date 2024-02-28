package ch05.lecture.p1array;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        //oldArray를 복사하고 길이가 5인 배열 생성
        int[] oldArray = {2, 4, 6};
        int[] newArray = new int[5];

        for (int i = 0; i < oldArray.length; i++)
            newArray[i] = oldArray[i];

        for (int item : newArray)
            System.out.print(item + ",");
        System.out.println(Arrays.toString(newArray));

        System.arraycopy(oldArray, 0, newArray, 1, oldArray.length);
        System.out.println(Arrays.toString(newArray));

        System.out.println(System.identityHashCode(oldArray));
        System.out.println(System.identityHashCode(newArray));


    }
}
