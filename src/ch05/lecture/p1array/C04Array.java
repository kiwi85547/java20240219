package ch05.lecture.p1array;

public class C04Array {
    public static void main(String[] args) {
        // 배열 : 같은 타입의 값을 여러개 갖는 자료형
        // 원소타입명[]

        // int 타입의 원소(element,item)들을 갖는 배열
        int[] arr;
//        int drr[]; 같은거

        // double 타입의 원소들을 갖는 배열
        double[] brr;

        // String 타입의 원소들을 갖는 배열
        String[] crr;

        // 실제 배열 객체를 만들고 변수에 할당
        arr = new int[]{6, 7, 8};
        brr = new double[]{1.23, 544.11};
        crr = new String[]{"가", "나", "한글"};

        // 다른 타입 원소는 넣을 수 없음
//        arr = new int[]{2.33,2};
//        crr = new String[]{"32",43};

        // 빈 배열
        crr = new String[]{};

        System.out.println(brr[1]);
    }
}
