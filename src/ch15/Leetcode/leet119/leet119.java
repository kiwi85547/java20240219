package ch15.Leetcode.leet119;

import java.util.ArrayList;
import java.util.List;
// 3월18일
// 14:00시 해설

// 강사님 코드
class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> next = new ArrayList<>();
            next.add(1);
            for (int n = 1; n < prev.size(); n++) {
                int sum = prev.get(n) + prev.get(n - 1);
                next.add(sum);
            }
            next.add(1);
            prev = next;
        }
        return prev;
    }
}

public class leet119 {
}

//Example 1:
//Input: rowIndex = 3
//Output: [1,3,3,1]
//Example 2:
//
//Input: rowIndex = 0
//Output: [1]
//Example 3:
//
//Input: rowIndex = 1
//Output: [1,1]
//
//    }
//}
// 코드 오류
//class Solution1 {
//    public List<Integer> getRow(int rowIndex) {
//        List<Integer> list = new ArrayList<>();
//        for(int i=0; i<=rowIndex; i++){
//            if (i == 0 || i==rowIndex) { //첫 인덱스와 마지막 인덱스에 1 넣기
//                list.add(1);
//            } else {
//                for (int j = i - 1; j > 0; j--) {
//                    list.set(j, list.get(j) + list.get(j - 1));
//                }
//            }
//        }
//        return list;
//    }
//}

//public class leet119 {
//    public static void main(String[] args) {
//        int numRows = 5; // 파스칼의 삼각형의 행 수 설정
//
//        List<List<Integer>> triangle = generatePascalTriangle(numRows);
//
//        // 생성된 파스칼의 삼각형 출력
//        for (List<Integer> row : triangle) {
//            System.out.println(row);
//        }
//        System.out.println("triangle = " + triangle);
//    }
//
//    public static List<List<Integer>> generatePascalTriangle(int numRows) {
//        List<List<Integer>> triangle = new ArrayList<>();
//
//        // 행 수(numRows)만큼 반복
//        for (int i = 0; i < numRows; i++) {
//            List<Integer> row = new ArrayList<>();
//            // 각 행의 첫 번째 요소는 항상 1
//            row.add(1);
//
//            // 이전 행의 값을 사용하여 현재 행을 생성
//            if (i > 0) {
//                List<Integer> prevRow = triangle.get(i - 1);
//                for (int j = 1; j < i; j++) {
//                    int sum = prevRow.get(j - 1) + prevRow.get(j);
//                    row.add(sum);
//                }
//                // 각 행의 마지막 요소는 항상 1
//                row.add(1);
//            }
//
//            // 현재 행을 파스칼의 삼각형에 추가
//            triangle.add(row);
//        }
//
//        return triangle;
//    }
//}
//
//
//public class PascalTriangle {
//    public static void main(String[] args) {
//        int numRows = 5; // 파스칼의 삼각형의 행 수 설정
//
//        ArrayList<Integer> triangle = generatePascalTriangle(numRows);
//
//        // 생성된 파스칼의 삼각형 출력
//        printPascalTriangle(triangle, numRows);
//    }
//
//    public static ArrayList<Integer> generatePascalTriangle(int numRows) {
//        ArrayList<Integer> triangle = new ArrayList<>();
//
//        // 파스칼의 삼각형 생성
//        for (int i = 0; i < numRows; i++) {
//            for (int j = i; j >= 0; j--) {
//                if (j == i || j == 0) {
//                    triangle.add(1);
//                } else {
//                    triangle.add(triangle.get(triangle.size() - i) + triangle.get(triangle.size() - i - 1));
//                }
//            }
//        }
//
//        return triangle;
//
//    }
//
//    public static void printPascalTriangle(ArrayList<Integer> triangle, int numRows) {
//        int index = 0;
//
//        // 파스칼의 삼각형 출력
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(triangle.get(index++) + " ");
//            }
//            System.out.println();
//        }
//    }
//}
