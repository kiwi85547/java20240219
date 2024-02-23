package ch03;

public class C02Assignment {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int c = 20;
        b += 5; // b = b+5
        System.out.println("b = " + b);
        c -= 5; // c = c-5
        System.out.println("c = " + c);

        double doubleB = b;
        doubleB /= a;// doubleB = doubleB/a
        b /= a; // b=b/a
        System.out.println("doubleB = " + doubleB);
        System.out.println("b = " + b);

        c %= b; // c= c%b
        c %= doubleB; // c= c%b
        double doubleC = (double) c;
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("doubleB = " + doubleB);
        System.out.println("doubleC = " + doubleC);

        int result = 0;
        result += 10;
        System.out.println("result = " + result);
        result -= 5;
        System.out.println("result = " + result);
        result *= 3;
        System.out.println("result = " + result);
        result /= 5;
        System.out.println("result = " + result);
        result %= 3;
        System.out.println("result = " + result);


    }
}
