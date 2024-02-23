package ch04.lecture.p4for;

public class C01for {
    public static void main(String[] args) {
        int q = 0;
        while (q < 3) {
            System.out.println("어떤 명령문");
            q++;
        }

        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("i 명령문");
        }

        int a = 10;
        double b = 2.5;
        double result1 = a + b; // 10 + 2.5
        int rusult2 = a + (int) b; // 10+2
        System.out.println("result1 = " + result1);
        System.out.println("rusult2 = " + rusult2);

        int x = 1;
        int y = 2;
        double result = (double) x / y;
        System.out.println(result);

    }
}
