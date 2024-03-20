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
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int number = 0;

        for (int item : nums) {
            map.put(item, number);
        }

        return sum;
    }
}

class Solution2 {
    public int sumOfUnique(int[] nums) {
        int[] arr = new int[]{};
        for (int item : nums) {
//            arr=item;
        }


        return 0;
    }
}