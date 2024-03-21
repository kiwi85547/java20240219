package ch15.lecture.p6of;

import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        // 저장 순서 유지x
        Set<String> set1 = Set.of("spring", "java", "css", "react");
        System.out.println(set1);
//        set1.remove("java"); //오류

        // 중복되면 오류
//        Set<String> set2 = Set.of("spring", "java", "spring");


    }
}
