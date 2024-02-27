package ch05.lecture.p1array;

public class C06Array {
    public static void main(String[] args) {
        // 배열 전체 탐색
        int[] arr = new int[]{2, 3, 4, 5, -24, 56, 234, -8};

//        System.out.println(arr[7]);

        // index 0번부터 끝까지 출력. for문과 배열은 같이 쓰는 경우가 많음
        for (int i = 0; i < arr.length; i++)
            System.out.println((i + 1) + "번째 배열원소 : " + arr[i]);

    }
}
