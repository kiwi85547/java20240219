package ch05.lecture.p1array;

public class C09Array {
    public static void main(String[] args) {
        int[] arr1; //배열 선언
        arr1 = new int[]{1, 2}; // 배열 할당

        int[] arr2 = new int[]{1, 2}; // 이것도 자주 일어남

        // 배열의 선언과 할당을 동시에 할 때 'new int[]' 생략 가능
        int[] arr3 = {2, 3, 4};

        // 배열
        int[] arr4;
//        arr4={3,4,5} // x

//        var arr5 = {10,22,33}; // var는 'new int[]' 생략 하면 안됨

        var arr5 = new int[]{10, 22, 33};


    }
}
