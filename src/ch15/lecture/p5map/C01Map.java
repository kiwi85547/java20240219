package ch15.lecture.p5map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01Map {
    public static void main(String[] args) {
        // map : (key, value)를 저장
        // python 딕셔너리랑 비슷
        // 같은 key를 가진 두 개의 entry를 저장할 수 없음

        Map<String, String> map = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        // entry 추가
        map.put("java", "programming language");
        map.put("css", "style sheet");
        map.put("css", "hi"); // 같은 key가 있으므로 value는 새로운 값으로 교체됨.
        map.put("html", "hypertext markup language");
        map.put("spring", "java framework");
        map.put("react", "frontend library");

        // map 크기
        // 같은 키를 가진 엔트리는 추가 되지 않는다.
        System.out.println(map.size()); //5
        System.out.println(map.toString());

        // entry 검색
        // 보통 key로 검색
        boolean b1 = map.containsKey("java"); //true
        boolean b2 = map.containsKey("css"); //true
        boolean b3 = map.containsKey("jsp"); //false
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        // entry의 value얻기
        String value1 = map.get("java");
        String value2 = map.get("css");
        String value3 = map.get("react");
        String value4 = map.get("jsp");
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);
        System.out.println("value4 = " + value4); //null. 문자열(?)
        //3월20일
        //3시40분 설명

        // entry 수정
        map.put("java", "프로그래밍 언어");
        String value5 = map.get("java");
        System.out.println("value5 = " + value5);

        if (map.containsKey("css")) {
            map.put("css", "스타일시트");
        }
        if (map.containsKey("jsp")) {
            map.put("jsp", "java server page");
        }

        System.out.println("map.get(\"css\") = " + map.get("css"));
        System.out.println("map.get(\"jsp\") = " + map.get("jsp"));

        // entry 지우기
        System.out.println(map.size());
        map.remove("css");
        System.out.println("map.get(\"css\") = " + map.get("css"));
        System.out.println(map.size());
        map.remove("jsp");
        System.out.println("map에 없는 jsp 지움");
        System.out.println("map.size() = " + map.size());

        // 전체탐색 모두 실습해보기
        // 1. keySet()
        Set<String> keys = map.keySet(); //Set은 리턴타입..
        //forEach
        //iterator
        //enhanced for
        System.out.println("-------------");
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }


        // 2. entrySet()
        //설명 4시5분
        System.out.println("####   entrySet && 향상된 for문 활용  #####");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //forEach
        //iterator
        //enhanced for
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // 3. forEach()
        System.out.println("####   forEach 메소드 활용  #####");
        map.forEach((k, v) -> System.out.println(k + ":" + v)); // 람다식 활용

    }
}
