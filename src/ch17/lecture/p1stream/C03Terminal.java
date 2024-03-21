package ch17.lecture.p1stream;

import java.util.List;

public class C03Terminal {
    public static void main(String[] args) {
        // 최종연산

        List<String> list
                = List.of("java", "css", "hello sua");

        //anyMatch
        boolean hasCss = list.stream()
                .anyMatch(e -> e.equals("css"));
        System.out.println("hasCss = " + hasCss);

        boolean hasJsp = list.stream()
                .anyMatch(e -> e.equals("jsp"));
        System.out.println("hasJsp = " + hasJsp);

        boolean hasBlank = list.stream()
                .anyMatch(e -> e.equals(" "));
        System.out.println("hasBlank = " + hasBlank);

        boolean lessTen = list.stream()
                .allMatch(e -> e.length() < 10);
        System.out.println("lessTen = " + lessTen);


    }
}
