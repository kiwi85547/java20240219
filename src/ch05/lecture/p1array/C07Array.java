package ch05.lecture.p1array;

public class C07Array {
    public static void main(String[] args) {
        // 배열 전체 탐색. 자주 있는 일
        // 향상된 for 문

        // 고전적 방법
        int[] arr = new int[]{12, 34, 56, 78, 90, 23, 634, 9, -75};
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println("-------------------------");

        // 향상된(enhanced) for 문
        // index 없이
        for (int item : arr)
            System.out.println(item);
        for (int a : arr)
            System.out.println(a);

        // 각 원소를 두 배한 값 출력
        System.out.println("---------각 원소를 두배한 값----------------");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] * 2);

        // 각 원소를 두 배한 값 출력
        System.out.println("--------------각 원소를 두배한 값-----------");
        for (int item : arr)
            System.out.println(item * 2);

        // 각 코드를 두배한 값으로 교체
        for (int item : arr)
            System.out.println(item);
    }
}
