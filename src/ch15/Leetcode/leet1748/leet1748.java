package ch15.Leetcode.leet1748;

import java.util.*;

public class leet1748 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = solution.sumOfUnique(new int[]{1, 2, 3, 2});
        System.out.println(num);
    }
}

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            Integer value = map.get(num);
            if (value == null) {
                map.put(num, 1);
            } else {
                map.put(num, value + 1);
            }
        }

        int result = 0;
        var entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                result += entry.getKey();
            }
        }


        return result;
    }
}
