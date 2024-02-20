package c02.lecture.p02type;

public class C20TypeConversion {
    public static void main(String[] args) {
        // 정수형 : byte(1), short(2), int(4), long(8)
        // 실수형 : float(4), double(8)
        // 작은 크기 타입의 값을 큰 크기 타입의 변수에 할당 가능
        // 반대는 안딤
        byte a = 23;
        int b = a;
        long c = b;
        double d = c;
//        byte e=d; //안됨
        System.out.println("d = " + d);

        short e = 22315;
        int f = e;
        long g = e;
//        byte h=e; //안됨

        float l = 3.14F;
        double m = l;
        System.out.println("m = " + m);
//        int n = l; //안됨

        // 정수형을 실수형에 할당 가능
        long p = 1234;
        double r = p;
        System.out.println("r = " + r);

        //char는 int 이상에 할당 가능
        char ch = 22;
        int in = ch;
        System.out.println("in = " + in);

        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue = " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드 = " + intValue);

        intValue = 40;
        long longValue = intValue;
        System.out.println("longValue = " + longValue);

        longValue = 144400;
        float floatValue = longValue;
        System.out.println("floatValue = " + floatValue);

        floatValue = 354846545;
        double doubleValue = floatValue;
        System.out.println("doubleValue = " + doubleValue);

    }
}
