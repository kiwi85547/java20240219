package ch02.lecture.p02type;

import java.math.BigDecimal;

public class C08Double {
    public static void main(String[] args) {
        //double
        //실수 표현 타입
        //8byte==64bits

        double a = 3.141592;
        double b = 1000000000000000012320.4846;
        //E=10^몇 승. 대소문자 구분 없음
        double c = -7756663.451;
        double d = 44555334.8885;
        //근사한 값 저장
//        double d = 154648489321234565;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        float var1 = 0.1234567890123456789f; //근사값으로 저장
        double var2 = 0.1234567890123456789; //근사값으로 저장
        //근사값으로 저장
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        double var3 = 3e6 * 31;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);

        float var6 = 3.14f;
        System.out.println("var6 = " + var6);

//        double(float)은 근사값으로 저장됨
        double c1 = 0.1;
        double c2 = 0.2;
        double c3 = c1 + c2; //근사값+근사값
        System.out.println("c3 = " + c3);

        // BigDecimal 사용해서 문제 해결. 정확한 값이 필요할 때
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        BigDecimal b3 = b1.add(b2);
        System.out.println("b3 = " + b3);
    }
}



