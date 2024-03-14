package ch12.lecture.p3regex;

public class C03PredefinedClass {
    public static void main(String[] args) {
        //[0-9] : \d
        //whitespace : \s
        //word character [a-zA-Z0-9_] : \w

        String p1 = "\\d";
        System.out.println("0".matches(p1)); //true
        System.out.println("12".matches(p1)); //false

        String p2 = "\s";
        System.out.println(" ".matches(p2));
        System.out.println("\t".matches("\\s")); //true
        System.out.println("\n".matches("\\s")); //true

        String str = "손 흥민";
        String s1 = str.replaceAll("\s", "");
        String s2 = str.replaceAll("\\s", "");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        //word character
        System.out.println("s".matches("\\w"));
        System.out.println("------------");
        System.out.println("*".matches("\\w")); //false

        // 모든 문자 : .
        System.out.println(" ".matches("."));
        System.out.println("$".matches("."));


    }
}
