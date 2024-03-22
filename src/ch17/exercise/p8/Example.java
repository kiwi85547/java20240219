package ch17.exercise.p8;

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

    @Override
    public String toString() {
        return "{name:" + name + ", job:" + job + "}";
    }
}

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                .collect(Collectors.groupingBy(Member::getJob));

        System.out.println("[개발자]");
        groupingMap.get("개발자")
                .stream()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("[디자이너]");
        groupingMap = list.stream()
                .filter(member -> member.getJob().equals("디자이너"))
                .collect(Collectors.groupingBy(e -> e.getJob()));
        System.out.println(groupingMap);


//        List<Member> developers = list.stream()
//                .filter(m -> m.getJob().equals("개발자"))
////                .collect(() -> new ArrayList<>() //이렇게써도 되지만 collectors가 있으니 그걸 쓰자
////                        , (c, e) -> c.add(e)
////                        , (a, b) -> {
////                        });
//                .collect(Collectors.toList());
//
////        List<Integer> result3 = list.stream()
////                .map(String::length)
////                .collect(Collectors.toList());
//
//
//        developers
//                .stream()
//                .forEach(member -> System.out.println(member.getName()));
    }
}
