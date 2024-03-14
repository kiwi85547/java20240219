package ch12.exercise.p17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String id2 = "abcdefg3";
        String id3 = "_Jungang501";
        String regExp = "[a-zA-Z][0-9a-zA-Z]{7,11}";
        boolean isMatch = Pattern.matches(regExp, id);
        System.out.println(isMatch);
        System.out.println(id2.matches(regExp));
        System.out.println(id3.matches(regExp));
    }
}
