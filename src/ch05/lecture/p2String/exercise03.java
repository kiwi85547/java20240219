package ch05.lecture.p2String;

public class exercise03 {
    public static void main(String[] args) {
        String a = "java";
        String b = new String("java");
        String c = "java";

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

        System.out.println(a == c); // true여도 쓰지 말기
        System.out.println(a.equals(c)); // true
    }
}
