package ch04.lecture.p4for;

public class C05ForExercise {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { //별 5개 5줄
            System.out.println("*****");
        }
        System.out.println(" ");
        for (int i = 0; i < 5; i++) { //별5개 5줄
            for (int j = 0; j < 5; j++)
                System.out.print("*");
            System.out.println();
        }

        // 조건식이 true일 때만 실행. false이면 for문 종료
        // 선생님은 조건식을 j를 기준으로 둠
        System.out.println("----------------");
        for (int i = 0; i < 5; i++) { //별 12345
            for (int j = 0; i >= j; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("----------------");

        for (int i = 0; i < 5; i++) { //별 54321
            for (int j = 0; i + j < 5; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 5; i > 0; i--) { //별 54321
            for (int j = 0; i - j > 0; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < 6; i++) { //별543210#12345
            for (int j = 0; i + j < 5; j++) {
                System.out.print("*");
            }
            for (int k = 0; i - k > 0; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) { //별 뒤에서부터 12345
            for (int j = 0; i + j < 4; j++) {
                System.out.print(" ");
            }
            for (int k = 0; i - k > -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) { //별 뒤에서부터 54321
            for (int j = 0; i - j > 0; j++) {
                System.out.print(" ");
            }
            for (int k = 0; i + k < 5; k++) { //증감식 5-i
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) { //숫자 0 01 012 0123 01234
            for (int j = 0; i - j >= 0; j++) //j<=i
                System.out.print(j);
            System.out.println();
        }
        for (int i = 0; i < 6; i++) { //숫자 1 12 123 1234 12345
            for (int j = 1; j < i + 1; j++)
                System.out.print(j);
            System.out.println();
        }

        //숫자 0 12 345 6789 01234

        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++, k++) //k는 0으로 계속 초기화 되지 않음. k값은 누적됨
                System.out.print(k % 10);
            System.out.println();
        }

        //숫자 1 23 456 7890 12345
        k = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++, k++)
                System.out.print(k % 10);
            System.out.println();
        }
    }
}
