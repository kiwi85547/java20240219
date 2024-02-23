package ch04.lecture.p5break;

public class ContinueExample {
    public static void main(String[] args) {
        //1~10 사이의 수 중에서 짝수만 출력하고 홀수인 경우에는 다음 반복으로 넘어감
        int i;
        for (i = 0; i < 11; i++) {
            if (i % 2 == 1)
                continue;
            System.out.println(i);
        }
    }
}
