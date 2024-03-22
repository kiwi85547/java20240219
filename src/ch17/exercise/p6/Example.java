package ch17.exercise.p6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

class Member {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("박보검", 32),
                new Member("송강", 31),
                new Member("차은우", 28)
        );

        double avg = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .orElse(0); // double로 리턴

        System.out.println("avg = " + avg); // 30.3333
    }
}
