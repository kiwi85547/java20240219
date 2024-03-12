package ch09.lecture.p2anonymous;

import java.util.Arrays;
import java.util.Random;

public class C07Sample {
    public static void main(String[] args) {
        // TODO : null 대신 익명클래스 객체 코드 작성

        Game rpgGame = new Game() {
            @Override
            public void play() {
                // 강사님 코드
                String[] rps = {"a", "b", "c"};
                Random random = new Random();
                System.out.println(rps[random.nextInt(3)]);
                System.out.println();

                int num = (int) (Math.random() * 3) + 1;
                switch (num) {
                    case 1 -> System.out.println("가위");
                    case 2 -> System.out.println("바위");
                    case 3 -> System.out.println("보");
                }
            }
        };
        rpgGame.play(); // 가위,바위,보 중 하나 출력

        Game lottoGame = new Game() {
            @Override
            public void play() {
                // 초보자 : 1~45 값 중 하나 출력
                int numLotto = (int) (Math.random() * 45) + 1;
                System.out.println("당신의 번호는 {" + numLotto + "}입니다.");

                // 중급자 : 1~45 값 중 6개 중복없이 출력
                int[] numbers = new int[6];
                int size = 0; //중복없이 뽑을 때마다 1씩 늘어나게하는 변수

                Random random = new Random();

                while (size < 6) {

                    int n = random.nextInt(45) + 1;
                    boolean alreadyHave = false;

                    // 이미 있는지?
                    for (int i = 0; i < size; i++) {
                        if (numbers[i] == n) {
                            alreadyHave = true;
                            break;
                        }
                    }
                    if (!alreadyHave) {
                        numbers[size] = n;
                        size++;
                    }

                }
                System.out.println(Arrays.toString(numbers));

            }
        };
        lottoGame.play();
    }
}

interface Game {
    void play();

}