package ch15.sec08;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        // List 불변 컬렉션 생성
        List<String> immutableList1 = List.of("A", "B", "C");
//        immutableList1.add("D"); //x

        Set<String> immutableSet1 = Set.of("A", "B", "C");

        Map<Integer, String> immutableMap1 = Map.of(
                1, "A",
                2, "B",
                3, "C");

        // List 컬렉션을 불변 컬렉션으로 복사
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("A");
        List<String> immutableList2 = List.copyOf(list);
        System.out.println("immutableList2 = " + immutableList2);

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set); // 순서 없이
        Set<String> immutableSet3 = Set.copyOf(list); // list가 같은 값 세개이므로 A 하나만 출력
        System.out.println("immutableSet2 = " + immutableSet2);
        System.out.println("immutableSet3 = " + immutableSet3);


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "A");
        Map<Integer, String> immutableMap2 = Map.copyOf(map); // 순서 없이
        System.out.println("immutableMap2 = " + immutableMap2);

        // 배열로부터 List 불변 컬렉션 생성
        String[] arr = {"A", "B"};
        List<String> immutableList3 = Arrays.asList(arr);
        System.out.println("immutableList3 = " + immutableList3);


    }
}
