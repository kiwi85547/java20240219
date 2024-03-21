package ch15.exercise.p9;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<String> keys = map.keySet();
        for (String key : keys) {
            totalScore += map.get(key);

            if (map.get(key) > maxScore) {
                maxScore = map.get(key);
                // 여기서 name을 정의할 순 없을까?
                name = key;

            }
        }

//        for (String key : map.keySet()) {
//            if (map.get(key).equals(maxScore)) {
//                name = key;
//            }
//        }

        // 강사님 코드
        String name2 = null;
        int maxScore2 = 0;
        int totalScore2 = 0;
        double sum = 0;
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            sum += entry.getValue();
            if (maxScore2 < entry.getValue()) {
                maxScore2 = entry.getValue();
                name2 = entry.getKey();
            }
        }
        double avg = sum / map.size();
        System.out.println("avg = " + avg);


        System.out.println("평균 점수: " + totalScore / map.size());
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
    }
}
