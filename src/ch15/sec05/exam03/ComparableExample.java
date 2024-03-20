package ch15.sec05.exam03;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("김길동", 25));
        treeSet.add(new Person("박길동", 31));

        for (Person person : treeSet) {
            System.out.println(person.name + ":" + person.age);
        }

    }
}

class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}