package ch11.lecture.p1exception;

import java.util.List;

public class C08Polymorphism {
    public static void main(String[] args) {
        try {
            List.of().get(0); // exception 발생
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("catch 블럭 코드");
        }

    }
}
