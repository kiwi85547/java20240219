package ch17.exercise.p5;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream()
                .filter(e -> e.matches(".*[jJ][aA][vV][aA].*"))
                .forEach(System.out::println);
        list.stream()
                .filter(e -> e.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }
}
