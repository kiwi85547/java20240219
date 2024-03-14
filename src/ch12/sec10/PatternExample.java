package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "02-1223-4567";
        boolean result = Pattern.matches(regExp, data);
        System.out.println(result);
        if ((result == true)) {
            System.out.println("일치");
        } else {
            System.out.println("불일치");
        }

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@my.company.com";
        result = Pattern.matches(regExp, data);
        System.out.println(result);
        String message = (result == true) ? "일치" : "불일치";
        System.out.println("message = " + message);

    }
}
