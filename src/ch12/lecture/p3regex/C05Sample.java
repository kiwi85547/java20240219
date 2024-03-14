package ch12.lecture.p3regex;

public class C05Sample {
    public static void main(String[] args) {
        // _, $, 영문대소문자, 숫자 조합
        // 단 숫자로 시작하면 안됨

//        String s1 = "[a-zA-Z_$][a-zA-Z0-9_$]+"; //이것도 됨
        String s1 = "(?!\\d)[a-zA-Z0-9_$]+";
        System.out.println("3num_".matches(s1));
        System.out.println("38$63s".matches(s1));
        System.out.println("RegularExpression012".matches(s1));
        System.out.println("class".matches(s1));
        System.out.println("MAX_Value".matches(s1));
        System.out.println("2".matches(s1));

    }
}
