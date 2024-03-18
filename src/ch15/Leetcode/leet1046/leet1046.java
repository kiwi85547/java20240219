package ch15.Leetcode.leet1046;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class leet1046 {
}

class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> stoneList = new ArrayList<>(Arrays.stream(stones).boxed().toList());

        while (stoneList.size() > 1) {
            stoneList.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    return b - a;
                }
            });
            int max1 = stoneList.remove(0);
            int max2 = stoneList.remove(0);
            int diff = max1 - max2;
            if (diff != 0) {
                stoneList.add(diff);
            }
        }
        if (stoneList.size() == 0) {
            return 0;
        } else {
            return stoneList.getFirst();
        }
    }
}