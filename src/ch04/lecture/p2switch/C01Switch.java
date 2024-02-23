package ch04.lecture.p2switch;

public class C01Switch {
    public static void main(String[] args) {
        System.out.println("statement 1");

        String city = "대구";
        switch (city) {
            // 값이 "서울"
            case "서울":
                System.out.println("statement 2");
                break;

            case "대구":
                System.out.println("statement 3");
                break;

            case "광주":
                System.out.println("statement 4");
                break;

            case "제주":
                System.out.println("statement 5");
                break;
        }
        System.out.println("statement 6");
        System.out.println("statement 7");
        System.out.println("statement 8");
        System.out.println("statement 9");
        System.out.println("statement 10");

    }
}
