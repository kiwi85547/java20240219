package ch11.lecture.p1exception;

import java.util.List;

public class C07Finally {
    public static void main(String[] args) {
        // finally
        // : exception 발생 여부와 관계없이 항상 실행되는 블럭
        // : return 후에도 실행된다.

        try {
            List.of("a", "b").get(2); // exception 발생
            List.of("a", "b").get(1); // exception 발생x

            return;
        } finally {
            System.out.println("무조건 실행");
        }

//        System.out.println("aa");

    }
}
