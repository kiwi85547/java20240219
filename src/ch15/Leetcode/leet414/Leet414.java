package ch15.Leetcode.leet414;

import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int item : nums) {
            treeSet.add(item);

            while (treeSet.size() >= 3) {
                treeSet.remove(treeSet.first());
            }
        }
        int num = treeSet.size() < 3 ? treeSet.last() : treeSet.first();
        return num;
    }
}

// 강사님 코드
class Solution_teacher {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() >= 3) {
            set.pollLast();
            set.pollLast();
        }
        return set.pollLast();
    }
}

public class Leet414 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.thirdMax(new int[]{3, 2, 1});
        System.out.println(result);
    }
}

