package ch04.lecture.p5break;

public class BreakOutterExample {
    public static void main(String[] args) {
        Label:
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'c')
                    break Label;
            }
        }


    }
}
