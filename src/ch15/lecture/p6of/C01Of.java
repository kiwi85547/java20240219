package ch15.lecture.p6of;

import java.util.*;

public class C01Of {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("html");
        list.add("css");
        System.out.println(list);
        // 수정 가능
        list.add("spring");
        list.remove(0);
        list.set(1, "vue");
        System.out.println(list);


        // of
        List<String> list2 = List.of("java", "css", "html", "react");
        System.out.println(list2);
        // 수정 불가능
//        list2.set(1, "vue"); //UnsuppportedOperationException
//        list2.add("jsp");
//        list2.remove(2);


    }
}
