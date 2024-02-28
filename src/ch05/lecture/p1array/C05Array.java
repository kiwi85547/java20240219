package ch05.lecture.p1array;

public class C05Array {
    public static void main(String[] args) {
        // 배열의 각 원소에 접근하는 방법 : index 사용
        // index는 0부터 시작

        int[] arr = new int[]{100, 200, 300};

        System.out.println(arr[0]);

        // index 값 변경하는 법
        arr[2] = 400;
        System.out.println(arr[2]);

        // 존재하지 않는 인덱스 사용 불가능
        //System.out.println(arr[3]); // 예외 발생


    }
}
