package ch04.lecture.p2switch;

public class C02Switch {
    public static void main(String[] args) {
        // break문 생략시 코드 실행은 계속 진행됨

        System.out.println("statement 1");

        String city = "부산";

        switch (city) {
            case "서울":
                System.out.println("서울");
                break;
            case "부산":
                System.out.println("부산");

            case "제주":
                System.out.println("제주");
                break;
        }


    }
}
