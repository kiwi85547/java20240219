package ch04.lecture.p5break;

public class C01breakExercise {
    public static void main(String[] args) {
        // while문을 이용해서 주사위 번호 중 하나를 반복적으로 뽑되, 6이 나오면 while문을 종료시킨다

        while (true) {
            int num = (int) (Math.random() * 6) + 1;


            if (num == 6)
                break;
            System.out.println(num);
        }
    }
}
