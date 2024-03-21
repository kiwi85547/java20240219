package ch15.lecture.p6of;

import java.util.ArrayList;
import java.util.List;

public class C04Modifiable {
    public static void main(String[] args) {
        // 3월 21일
        // 12시42분 설명
        List<Integer> list = List.of(4, 1, 8, 9);
        List<Integer> list2 = new ArrayList<>(list);

        System.out.println("list2 = " + list2);
        list2.add(100);
        System.out.println("list2 = " + list2);
    }
}
