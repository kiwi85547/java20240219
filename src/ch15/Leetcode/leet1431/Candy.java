package ch15.Leetcode.leet1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Candy {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        System.out.println("solution = " + solution);

        Solution_Leetcode solution1 = new Solution_Leetcode();
        solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        
    }
}

//1. 배열을 탐색해서 최고값 찾기
//2. 새 리스트 만들기
//3. 배열을 탐색해서 각 아이템과 extraCandies를 더한 값이
//   위에서 찾은 최고값보다 크거나 같으면 true, 아니면 false
//4. List에 추가(add)
//5. 완성된 List를 리턴
class Solution {

    private int max;

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}

class Solution_Leetcode {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find out the greatest number of candies among all the kids.
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }
        // For each kid, check if they will have greatest number of candies
        // among all the kids.
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }
}