package ch05.lecture.p1array;

public class C11Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int item : arr)
            System.out.println("item = " + item);
        arr[0] = 123;
        arr[1] = 123;
        arr[2] = 45;
        for (int item : arr) {
            System.out.println("item = " + item);
        }


    }
}
