package ch03.lecture.p2assignment;

public class C02Assignment {
    public static void main(String[] args) {
        // assignment operator(할당연산자, 대입연산자)
        // 기호 : =
        // 오른쪽 값을 왼쪽에 대입(할당, assign)
        // 연산순서는 오른쪽부터
        // 우선순위가 매우 낮다.

        int a = 3;
        int b = 2;
        int c = b;
        int d = c = 7;
        System.out.println(d);

        int e = c = b + 1 + a * d << 1;
        System.out.println("e = " + e);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("b = " + b);


    }
}
