package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("JDBC"); // 중복 객체이므로 저장하지 않음
        set.add("Spring");

        int size = set.size();
        System.out.println("총 객체 수: " + size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("JSP")) {
                iterator.remove();
            }
        }
        System.out.println("----------------");

        set.remove("JDBC");

        // 객체를 하나씩 가져와서 처리
        for (String element : set) {
            System.out.println(element);
        }


        Set<Member> set2 = new HashSet<>();
        set2.add(new Member("홍길동", 30));
        set2.add(new Member("홍길동", 30));

        System.out.println("재정의된 메소드 총 객체 수: " + set2.size());

    }
}

class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(name, member.name) && Objects.equals(age, member.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}