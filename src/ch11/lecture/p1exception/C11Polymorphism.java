package ch11.lecture.p1exception;

import java.util.List;

import static java.lang.Class.forName;

public class C11Polymorphism {
    public static void main(String[] args) {

        try {
            Class.forName("java.lang.String");
            List.of().get(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // catch블록 하나로도 잡을 수 있다
        }
    }
}
