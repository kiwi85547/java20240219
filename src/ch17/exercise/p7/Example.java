package ch17.exercise.p7;

import java.util.*;
import java.util.stream.Collectors;

class Member {
    private String name;
    private String job;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }
}

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        List<Member> developers = list.stream()
                .filter(m -> m.getJob().equals("개발자"))
//                .collect(() -> new ArrayList<>() //이렇게써도 되지만 collectors가 있으니 그걸 쓰자
//                        , (c, e) -> c.add(e)
//                        , (a, b) -> {
//                        });
                .collect(Collectors.toList());

//        List<Integer> result3 = list.stream()
//                .map(String::length)
//                .collect(Collectors.toList());


        developers
                .stream()
                .forEach(member -> System.out.println(member.getName()));
    }
}
