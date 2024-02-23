package ch04.lecture.p2switch;

public class C03SwitchExpression {
    public static void main(String[] args) {
        int value = 1;
        switch (value) {
            case 1 -> System.out.println("case1");
            case 2 -> System.out.println("value = " + value);
        }


        System.out.println("s");
        System.out.println("s");
    }
}
