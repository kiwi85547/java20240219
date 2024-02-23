package ch04.lecture.p4for;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        //구구단 2단부터 9단까지 출력
        int i, j;
        for (i = 2; i <= 9; i++) {
            System.out.println(STR."---------\{i}단----------"); //string templete 사용
            for (j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
