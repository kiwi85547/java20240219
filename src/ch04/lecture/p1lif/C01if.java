package ch04.lecture.p1lif;

public class C01if {
    public static void main(String[] args) {
        // if : 조건문, 분기문(branch)
        // () 괄호의 값이 true이면 {}중괄호(코드블럭)을 실행하고
        //        false면 시행하지 않는다.
        if (false)
            System.out.println("false");

        int answer = 0;
        int i;
        for (i = 1; i <= 4; i++)
            if (i % 2 == 0)
                answer += i;
        System.out.println("i = " + i);
        System.out.println("answer = " + answer);

        int a, b;
        int n = 5, slice = 3;

        a = n / slice;
        b = n % slice;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if (n % slice != 0)
            a += 1;
        System.out.println("피자판수 = " + a);


    }
}
