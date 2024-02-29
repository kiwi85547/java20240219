package ch05.lecture.p2String;

public class C04CharAt {
    public static void main(String[] args) {
        // 첫번째(index 0) s
        // 두번째(index 1) o
        // 세번째(index 2) n

        String a = "son";
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));

        // char 타입 리턴
        char c = a.charAt(0);

        String b = """
                hello
                world
                """;
        System.out.println(b.charAt(0)); //
        System.out.println("6번째 문자열 : " + b.charAt(5)); //
        System.out.println("마지막 문자열 : " + b.charAt(b.length() - 1));


    }
}
