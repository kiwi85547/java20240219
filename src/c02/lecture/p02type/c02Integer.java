package c02.lecture.p02type;

public class c02Integer {
    public static void main(String[] args) {
        // 정수타입
        // int
        int a=5;
        int b=20;
        b=25;
        b=44;
        b=-2;
        System.out.println(b);
        byte c= -128;
        System.out.println(c);
        a=132+124;
        System.out.println(a);
        long d=2147483648L;
        System.out.println(d);
        long e=34L;
        System.out.println(e);
        // long

        // byte, short

        int x;
        x=0b1011;
        System.out.println("2진수: "+x);
        x=013;
        System.out.println("8진수: "+x);
        x=0xB3;
        System.out.println("16진수: "+x);
    }
}
