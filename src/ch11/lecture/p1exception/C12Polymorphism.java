package ch11.lecture.p1exception;

import java.util.List;

public class C12Polymorphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String"); //ClassNotFoundException
            List.of().get(0); // IndexOufOfBoundsException
            Integer.parseInt("family"); //NumberFormatException
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
