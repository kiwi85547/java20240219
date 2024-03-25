package ch11.lecture.p1exception;

import java.util.List;

public class C13Multicatch {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            List.of().get(0);
            System.out.println("------------");
            System.out.println("위에서 ArrayIndexOutOfBoundsException 실행됐으므로 아랫줄은 실행 안됨");
            Integer.parseInt("two");
        } catch (ClassNotFoundException e) {
            System.out.println("코드1");
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("코드2");
            System.err.println("예외 발생");
            e.printStackTrace();
        }
    }
}
