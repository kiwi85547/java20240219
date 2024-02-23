package ch04.lecture.p3while;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        //1부터 100까지의 합 구하기

        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
