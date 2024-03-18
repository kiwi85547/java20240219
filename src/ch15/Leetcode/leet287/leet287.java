package ch15.Leetcode.leet287;

import java.util.*;

public class leet287 {
}

class Solution {
    public int findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}
