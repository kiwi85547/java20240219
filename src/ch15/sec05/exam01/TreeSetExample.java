package ch15.sec05.exam01;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        //TreeSet 컬렉션 생성
        TreeSet<Integer> scores = new TreeSet<>();

        //Integer 객체 저장
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        //정렬된 Integer 객체를 하나씩 가져오기
        for (Integer s : scores) {
            System.out.println(s + " ");
        }
        System.out.println("-----------\n");

        // 특정 Integer 객체를 가져오기
        System.out.println(scores.first());
        System.out.println(scores.last());
        System.out.println(scores.lower(95));
        System.out.println(scores.higher(95));
        System.out.println(scores.floor(95)); // 중요하지 않음
        System.out.println(scores.ceiling(85) + "\n");

        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for (Integer s : descendingScores) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for (Integer s : rangeSet) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

        rangeSet = scores.subSet(80, true, 90, false);
        for (Integer s : rangeSet) {
            System.out.println(s + " ");
        }
    }
}
