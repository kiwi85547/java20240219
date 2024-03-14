package ch12.lecture.p3regex;

public class C02CharacterClass {
    public static void main(String[] args) {
        // 문자집합
        System.out.println("a".matches("[abc]")); //true
        System.out.println("a".matches("[abc]")); //true

        // a 또는 b 또는 c
        System.out.println("abc".matches("[abc]")); //false

        String p1 = "[abc][abc][abz]"; //abc중 하나, 두번째글자 abc중 하나,세번째글자 abz중 하나
        System.out.println("ccc" + "ccc".matches(p1)); //false

        String p2 = "[a-z]"; //모든 소문자

        String p3 = "[a-zA-Z]"; //a through z or A through Z, inclusive (range)
        System.out.println("M".matches(p3)); //true

        String p4 = "[a-zA-Z0-9]"; //영문 대소문자와 숫자
        String p5 = "[가-힣]"; //한글 한글자

        String p6 = "[^abc]";
        System.out.println("c".matches(p6)); //false
        System.out.println("B".matches(p6)); //true

    }
}
