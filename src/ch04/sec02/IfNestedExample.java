package ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        //80점 이상 100점 이하의 점수 랜덤으로 추출
        int score = (int) (Math.random() * 21) + 80;
        System.out.println("당신의 점수는 " + score + "점입니다.");

        String grade;
        if (score >= 80 && score < 90) {
            if (score < 85)
                grade = "B";
            else
                grade = "B+";
        } else if (score < 95)
            grade = "A";
        else
            grade = "A+";
        System.out.println("당신은 등급은 " + grade + "입니다.");
    }
}
