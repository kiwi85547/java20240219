package ch12.lecture.p3regex;

public class C01Character {
    public static void main(String[] args) {
        // 특정 규칙의 문자열

        String pattern1 = "a";
        boolean b1 = "a".matches(pattern1); //true
        System.out.println("b1 = " + b1);

        System.out.println("b".matches(pattern1)); //false
        System.out.println("aa".matches(pattern1)); //false
        System.out.println("aa".matches("aa"));
        System.out.println("ab".matches("ab"));
        //한문자를 표현한 패턴을 두 개 모아놓은 것
        System.out.println("aa".matches("ba")); //false
        System.out.println("\\".matches("\\\\")); //true

        // regex . : 모든 문자
        System.out.println(".".matches("."));
        System.out.println("a".matches("."));
        System.out.println("C".matches("."));
        System.out.println("9".matches("."));
        System.out.println("abc".matches("."));

        System.out.println(".".matches("\\.")); //true 점만 표현하고 싶을 때

        // 대소문자 구분함


    }
}
