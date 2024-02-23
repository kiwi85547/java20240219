package ch04;

public class progrmmer {
    public static void main(String[] args) {
        int angle = 40;
        int answer = 0;

//        switch (angle) {
//            case 90 -> answer = 2;
//            case 180 -> answer = 4;
//        }
//        System.out.println("answer = " + answer);

        // switch Expression
        // 저장 할 변수를 switch문 앞에 정의할 수 있음
        answer = switch (angle) {
            case 90 -> 2;
            case 180 -> 4;
            default -> 0;
        };
        System.out.println("answer = " + answer);


    }
}
