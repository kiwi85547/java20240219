package ch11.lecture.p1exception;

public class C10Polymorphism {
    public static void main(String[] args) {

        try {
            Class.forName("java.lang.String3");
//            List.of().get(0);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("class not found");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("runtime");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("----");
        }
    }
}
