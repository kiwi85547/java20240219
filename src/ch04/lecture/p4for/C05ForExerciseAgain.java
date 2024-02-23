package ch04.lecture.p4for;

public class C05ForExerciseAgain {
    public static void main(String[] args) {
        int i, j, k;
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("-------------------");

        /*

         *
         **
         ***
         ****
         *****

         */
        System.out.println("ajsdf");
        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("dfdfk");

        for (i = 0; i < 5; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("-------------------");

        /*

         *****
         ****
         ***
         **
         *

         */
        for (i = 0; i < 5; i++) {
            for (j = 5; j - i > 0; j--)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("-------------------");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5 - i; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("-------------------");

        /*

        *****
        ****#
        ***##
        **###
        *####
        #####

         */
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 5 - i; j++)
                System.out.print("*");
            for (k = 0; k < i; k++)
                System.out.print("#");
            System.out.println();
        }
        System.out.println("---------12345--");
        //오른쪽부터 별 1 2 3 4 5개
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5 - i; j++)
                System.out.print(" ");
            for (k = 0; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("---------54321--");
        //오른쪽부터 별 5 4 3 2 1개
        for (i = 0; i < 5; i++) {
            for (j = 0; j < i; j++)
                System.out.print(" ");
            for (k = 0; k < 5 - i; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("-------------------");

        /*

        0
        01
        012
        0123
        01234

         */

        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
        System.out.println("-------------------");
        /*

        1
        12
        123
        1234
        12345

         */
        for (i = 1; i < 6; i++) {
            for (j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-------------------");
        /*

        0
        12
        345
        6789
        01234

         */

        for (i = 0, k = 0; i < 5; i++) {
            for (j = 0; j <= i; j++, k++)
                System.out.print(k % 10);
            System.out.println();
        }
        System.out.println("-------------------");
        /*

        1
        23
        456
        7890
        12345

         */
        for (i = 0, k = 1; i < 5; i++) { //i,j는 구조만 잡는 것
            for (j = 0; j <= i; j++, k++) { //값은 k가 가짐
                System.out.print(k % 10);
            }
            System.out.println();
        }
        System.out.println("-------------------");

        // 4층 피라미드 출력하기
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        // 10층 피라미드 출력하기
        for (i = 0; i < 10; i++) {
            for (j = 1; j < 10 - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        // 10층 역피라미드 출력하기
        for (i = 10; i > 0; i--) {
            for (j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------");

    }
}
