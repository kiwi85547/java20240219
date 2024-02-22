package lecture;

public class p03compare {
    public static void main(String[] args) {
        // 비교 연산자
        // ==, !=, >, >=, <, <=
        // settings - font - enable ligatures 비교연산자 기호가 바뀜
        // 연산결과 : boolean ( true, false )
        // 다른 타입간 연산 가능 ( 하지만 가능하면 같은 타입끼리 연산 )
        int a = 5;
        int b = 10;

        boolean b1 = a == b;
        System.out.println("b1 = " + b1);
        boolean b2 = a != b;
        System.out.println("b2 = " + b2);
        boolean b3 = a >= b;
        System.out.println("b3 = " + b3);
    }
}
