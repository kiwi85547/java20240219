package ch03.lecture;

public class ConditionalOperation {
    public static void main(String[] args) {
        int score = 95;
        char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
        System.out.println(score + "점은 " + grade + "등급입니다.");

        String strValue = "2345";
        System.out.println("strValue = " + strValue);
        System.out.println(Integer.parseInt(strValue));


    }
}
