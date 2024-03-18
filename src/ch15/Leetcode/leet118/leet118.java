package ch15.Leetcode.leet118;

import java.util.ArrayList;
import java.util.List;

// 3월19일
// 오후 11시 설명
public class leet118 {
    public static void main(String[] args) {
//        List<List<Integer>> list = generate(numRows);
//        for (List<Integer> row : list) {
//            System.out.println(row);
//        }
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1));

        for (int i = 2; i <= numRows; i++) {
            List<Integer> prev = list.getLast();
            List<Integer> next = new ArrayList<>();
            next.add(1);

            for (int n = 1; n < prev.size(); n++) {
                next.add(prev.get(n) + prev.get(n - 1));
            }
            next.add(1);
            list.add(next);
        }
        return list;
    }
}


//class Solution {
//    public static List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> list = new ArrayList<>();
//        for (int i = 1; i <= numRows; i++) {
//            List<Integer> row = new ArrayList<>();
//            for (int j = 0; j <= i; j++) {
//                if (j == 0 || j == i) {
//                    list.get(i).add(j - 1, 1);
//                } else {
//                    int sum = list.get(i).get(i - 1) + list.get(i).get(i);
//                    list.get(i).add(sum);
//                }
//            }
//        }
//        return list;
//    }
//}