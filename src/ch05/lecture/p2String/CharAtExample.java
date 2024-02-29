package ch05.lecture.p2String;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1', '3' -> System.out.println("남자입니다");
            case '2', '4' -> System.out.println("여자입니다");
        }
        String my_string = "jaron";
        String answer = "";
//        answer = answer + my_string.charAt(4);
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        System.out.println("answer = " + answer);

    }
}
