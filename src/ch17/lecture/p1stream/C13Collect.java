package ch17.lecture.p1stream;

import java.util.ArrayList;
import java.util.List;

public class C13Collect {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "html", "react");
        //최종연산이 4,6,3,4,5

        // 고전적 방법
        List<Integer> result1 = new ArrayList<>(); // 또는 HashMap
        for (String s : list) {
            result1.add(s.length());
        }
        System.out.println(result1);


        List<Integer> result2 = list.stream() //ArrayList<>()를 리턴하는 코드 작성
                .collect(() -> new ArrayList<Integer>(),
                        (c, e) -> c.add(e.length()),
                        (a, b) -> {
                        });
        System.out.println("result2 = " + result2);
    }
}
