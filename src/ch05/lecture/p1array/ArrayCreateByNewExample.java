package ch05.lecture.p1array;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        //배열 변수 선언과 배열 생성 // 배열 항목의 초기값 출력 //배열 항목의 값 변경 // 출력 //배열 변수 선언과 배열 생성
        int[] arr1 = new int[3];
        for (int item : arr1)
            System.out.println("item = " + item);
        arr1[0] = 10;
        for (int item : arr1)
            System.out.println("item = " + item);

        double[] arr2 = new double[3];
        for (double item : arr2)
            System.out.println("item = " + item);
        arr2[0] = 1;
        arr2[1] = 3.141592;
        for (double item : arr2)
            System.out.println("item = " + item);

        String[] arr3 = new String[3];
        for (String item : arr3)
            System.out.println("item = " + item);
        arr3[0] = "가";
        arr3[1] = "나";
        arr3[2] = "다";
        for (String item : arr3)
            System.out.println("item = " + item);


    }
}
