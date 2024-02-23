package ch04.lecture.p2switch;

public class C09Yield {
    public static void main(String[] args) {
        String city = "seoul";

        String continent = switch (city) {
            case "seoul" -> "asia";
            case "paris" -> {
                yield "europe"; // 마지막에 존재
            }
            default -> "etc.";
        };
        System.out.println("continent = " + continent);

        int length = 5; // 원의 반지름, 혹은 정사각형의 한 변의 길이
        String shape = "정사각형"; //원, 정사각형

        // 원, 정사각형 두가지 케이스 중에서 넓이를 계산하는 코드
        double result = switch (shape) {
            case "원" -> {
                double calc = length * length * 3.14;
                yield calc; // switch 블록 내에서 계산된 값을 반환하는 yield 키워드
                // 항상 switch 블록 내에서만 사용된다. 함수의 return과 비슷하다
            }
            case "정사각형" -> length * length;
            default -> 0.0;
        };
        System.out.println("result = " + result);
    }
}

