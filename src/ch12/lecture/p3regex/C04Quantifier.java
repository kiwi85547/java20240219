package ch12.lecture.p3regex;

public class C04Quantifier {
    public static void main(String[] args) {
        // 수량자
        // {n} : 정확히 n번
        // {n,m} : n~m번
        // {n,} : n번 이상
        // + : {1,} : 1번 이상
        // * : {0,} : 0번 이상
        // ? : {0,1} : 한번 또는 없음

        //{n} : n번
        String p1 = "\\d{3}";
        System.out.println("012".matches(p1));//true
        System.out.println("3".matches(p1)); //false

        String p2 = "010-\\d{4}-\\d{4}";
        System.out.println("010-123-4567".matches(p2)); //false
        System.out.println("010-1234-5678".matches(p2)); //true
        System.out.println("abc-defr-gsdf".matches(p2)); //false

        //{n,m}
        String p3 = "[가-힣]{3,4}";
        System.out.println("손흥민".matches(p3)); //true
        System.out.println("대한민국".matches(p3)); //true
        System.out.println("한국".matches(p3)); //false
        System.out.println("alex김".matches(p3)); //false
        System.out.println("------------------");

        //{n,}
        String p4 = "[가-힣]{2,}";
        System.out.println("손흥민".matches(p4)); //true
        System.out.println("대한민국".matches(p4)); //true
        System.out.println("한국".matches(p4)); //true
        System.out.println("alex김".matches(p4)); //false
        System.out.println("------------------");


        String p5 = "[가-힣_A-Za-z]{1,}"; // 영문대소문자와 한글 한글자 이상
        System.out.println("hello화영".matches(p5)); //true
        System.out.println("seoul 한국".matches(p5)); //false
        System.out.println("RegularExpression정규표현식".matches(p5)); //true
        System.out.println("Regular Expression 정규표현식".matches(p5)); //false
        System.out.println("------------------");


        // ? :{0,1} once or not at all
        String p6 = "010-{0,1}\\d{4}-?\\d{4}";
        System.out.println("010-3082-3339".matches(p6)); //ture
        System.out.println("01030823339".matches(p6)); //ture
        System.out.println("010-30823339".matches(p6)); //ture
        System.out.println("------------------");

        // + : 1번 이상
        String p7 = "\\w+";
        System.out.println("dfjdk364".matches(p7)); //ture
        System.out.println("------------------");

        // * : 0번 이상
        String p8 = "\\w*";
        System.out.println("".matches(p8)); //true

    }
}
