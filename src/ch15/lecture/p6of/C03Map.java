package ch15.lecture.p6of;

import java.util.Map;

public class C03Map {
    public static void main(String[] args) {
        // of 메소드
        // key,value 쌍이므로 꼭 짝수로 넣어주기
        Map<String, String> map = Map.of("css", "style sheet", "spring", "framework");
        System.out.println(map);
    }
}
