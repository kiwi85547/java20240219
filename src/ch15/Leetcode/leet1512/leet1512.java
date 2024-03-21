package ch15.Leetcode.leet1512;


import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class leet1512 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.numIdenticalPairs(new int[]{1, 1, 1, 1, 2, 3, 2});
        System.out.println("result = " + result);
    }

}

//3월21일 10시30분 해설
class Solution {
    public int numIdenticalPairs(int[] nums) {
        // 각 원소의 갯수 세어서
        // (원소, 원소수) 쌍의 맵 만들기
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {

            // 이렇게 써도 됨
//            Integer val = map.getOrDefault(num,0);
//            map.put(num,val+1);
//

            Integer val = map.get(num);
            if (val == null) {
                map.put(num, 1);
            } else {
                map.put(num, val + 1);
            }
        }

        // 각 원소수로 n * (n-1) / 2 구해서
        // 모두 더하기
        int sum = 0;
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            Integer val = map.get(key);
            int r = val * (val - 1) / 2;
            sum += r;
        }

        // 위에서 모두 더한값 리턴
        return sum;

    }
}
