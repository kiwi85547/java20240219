package ch05.lecture.p2String;

public class EqualsExample {
    public static void main(String[] args) {
        String strVa1;
        strVa1 = "홍길동";
        String strVa2 = "홍길동";
        System.out.println("strVa2 = " + strVa2);
        strVa1 = "조화영";
        strVa2 = "나";
        System.out.println("strVa2 = " + strVa2);
        String strVal1 = "d";
        System.out.println("strVal1 = " + strVal1);


        if (strVa1 == strVa2)
            System.out.println("참조 값이 같음");
        else System.out.println("참조 값이 다름");

        if (strVa1.equals(strVa2))
            System.out.println("문자열이 같음");
        else System.out.println("문자열이 다름");


        strVa1 = new String("홍길동");
        String strVa4 = new String("홍길동");

        if (strVa1 == strVa4)
            System.out.println("참조 값이 같음");
        else System.out.println("참조 값이 다름");

        if (strVa1.equals(strVa4))
            System.out.println("문자열이 같음");
        else System.out.println("문자열이 다름");
    }
}
