package c03.sec02;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int n1 = 10, n2 = 10;
        boolean r1 = (n1 == n2);
        boolean r2 = n1 != n2;
        boolean r3 = n1 < n2;
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        char char1 = 'A';
        char char2 = 64;
        boolean r4 = char1 < char2;
        System.out.println("r4 = " + r4);
        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        // 문자 A를 정수형으로 바꿈. A의 유니코드가 출력됨.
        System.out.println("char2의 유니코드 = " + (int) char2);

        int n3 = 1;
        double n4 = 1.0;
        boolean r5 = n3 == n4;
        System.out.println("r5 = " + r5);

        // 실수간의 ==, != 매우 주의!

        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c == 0.3); //반올림 같은 것 추가해야 함.

        float n5 = 0.1f;
        double n6 = 0.1;
        boolean r6 = n5 == n6;
        boolean r7 = n5 == (float) n6;
        System.out.println("r6 = " + r6);
        System.out.println("r7 = " + r7);

        String str1 = "자바";
        String str2 = "Java";
        //String간의 비교는 equals 메소드 사용
        boolean r8 = str1.equals(str2);
        boolean r9 = (!str1.equals(str2));
        System.out.println("r8 = " + r8);
        System.out.println("r9 = " + r9);


    }
}
