package ch05.lecture.p1array;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        // 배열 변수 선언 // 배열 변수에 배열을 대입 // 배열 항목의 총합을 구하고 출력 //배열을 매개값으로 주고, printItem() 메소드 호출

        int sum = 0;
        int sum1 = 0;
        int[] arr;
        arr = new int[]{83, 90, 87};
        for (int arr1 : arr) {
            sum += arr1;
        }
        System.out.println("sum = " + sum);

        // 이렇게도 할 수 있음
        sum1 += arr[0];
        sum1 += arr[1];
        sum1 += arr[2];
        System.out.println("sum1 = " + sum1);

        printItem(new int[]{83, 90, 87});

    }

    private static void printItem(int[] scores) {
        //매개변수가 참조하는 배열의 항목을 출력

    }
}
