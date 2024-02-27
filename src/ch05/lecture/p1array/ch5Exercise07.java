package ch05.lecture.p1array;

public class ch5Exercise07 {
    public static void main(String[] args) {

        // for 문 이용해서 최대값 출력
        int x = 0;
        int[] array = {1, 5, 3, 8, 2};
        for (int i = 0; i < array.length; i++) {
            if (x < array[i])
                x = array[i];
        }
        System.out.println("x = " + x);

        int y = 0;
        int max = array[0];
        for (int item : array) {
            if (item < max)
                max = item;

            if (y < item) {
                y = item;
                System.out.println("if문 안쪽 = " + y);
            }
            System.out.println(y);
        }
        System.out.println("y = " + y);

        char a = 'A'; // 유니코드 65
        char b = 'B'; // 유니코드 66
        System.out.println(a + b); // 65+66인 131 출력
    }
}
