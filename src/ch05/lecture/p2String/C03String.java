package ch05.lecture.p2String;

public class C03String {
    public static void main(String[] args) {
        String ho = "";
        if (ho.isBlank())
            System.out.println("ho 변수가 참조하는 String 객체는 빈 문자열");
        if (ho.isEmpty())
            System.out.println("\"empty\" = " + "empty");

    }
}
