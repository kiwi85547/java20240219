package ch07.lecture.p7object;

public class C01Inheritance {
    public static void main(String[] args) {
        String s = "java";
        Object o = s;

        // 실제 실행되는건 String에 있는 메소드
        // String에서 재정의했기 때문에
        o.equals("hello");
        o.hashCode();
        o.toString();

        boolean b1 = o.equals("hello");
        int h1 = o.hashCode();
        String s1 = o.toString();

        boolean b2 = s.equals("hello");
        int h2 = s.hashCode();
        String s2 = s.toString();

    }
}
