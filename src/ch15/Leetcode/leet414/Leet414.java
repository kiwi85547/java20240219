package ch15.Leetcode.leet414;

import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int item : nums) {
            treeSet.add(item);
            if (treeSet.size() > 3) {
                treeSet.remove(treeSet.first());
            }
        }
        int num = treeSet.size() < 3 ? treeSet.last() : treeSet.first();
        return num;
    }
}

public class Leet414 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.thirdMax(new int[]{3, 2, 1});
        System.out.println(result);
    }
}