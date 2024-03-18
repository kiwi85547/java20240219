package ch15.programmers.p1;

import java.util.*;

class hash {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
//        HashSet.solution(new int[]{4, 4, 4, 3, 3});

    }
}

// 강사님 다르게 해석. 중복인 수 모두 제거
class Solution {
    public int[] solution(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] answer = new int[set.size()];
        int i = 0;
        for (Integer num : set) {
            answer[i++] = num;
        }
        return answer;
    }
}
