package ch06.sec11;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567", "김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

//        k1.ssn="123"
        k1.name = "홍길동";
    }
}

class Korean {
    final String nation = "대한민국";
    final String ssn;

    String name;

    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}