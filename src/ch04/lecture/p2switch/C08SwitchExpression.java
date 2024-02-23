package ch04.lecture.p2switch;

public class C08SwitchExpression {
    public static void main(String[] args) {
        //switch 구문이 식 안에 들어갈 수 있음.

        String city = "서울"; // 서울, 도쿄, 런던, 파리

        System.out.println(city + "은(는) " + switch (city) {
            case "서울", "도쿄" -> "아시아";
            case "런던", "파리" -> "유럽";
            default -> "기타지역";
        }
                + "에 있습니다");
    }
}

