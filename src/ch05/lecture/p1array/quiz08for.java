package ch05.lecture.p1array;

public class quiz08for {
    public static void main(String[] args) {
        int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}}; // 원소 또는 요소
        double sum = 0;
        int cnt = 0;
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                cnt += 1;
            }
        }
        System.out.println("length = " + length);
        System.out.println("sum = " + sum);
        System.out.println("cnt = " + cnt);

        double avg = sum / length;
        System.out.println("avg = " + avg);
    }
}
