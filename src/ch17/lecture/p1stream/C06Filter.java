package ch17.lecture.p1stream;

import java.util.List;

public class C06Filter {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 2, 1, 9, 8, 7);

        list.stream()
//                .filter(e -> e.length() % 2 == 1)
                .count();

    }

    ;
}
