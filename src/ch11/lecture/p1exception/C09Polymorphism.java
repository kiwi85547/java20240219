package ch11.lecture.p1exception;


public class C09Polymorphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String3");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("----");
        }
    }
}
