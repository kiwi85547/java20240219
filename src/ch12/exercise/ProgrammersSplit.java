package ch12.exercise;


import java.util.Arrays;

public class ProgrammersSplit {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] arr = s.solution("axbxcxdx");
        System.out.println("arr = " + Arrays.toString(arr));
        String[] arr2 = s.solution("dxccxbbbxaaaa");
        System.out.println("arr2 = " + Arrays.toString(arr2));
        String[] arr3 = s.solution("sadxjflxxa");
        System.out.println("arr3 = " + Arrays.toString(arr3));
        String[] arr4 = s.solution("xxxilxxxmsxl");
        System.out.println("arr4 = " + Arrays.toString(arr4));
        String[] arr5 = s.solution("xxaxiolxmakxxiomxxx");
        System.out.println("arr5 = " + Arrays.toString(arr5));
    }
}

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        myString = myString.replaceAll("^x+", "");
        answer = myString.split("x+");
        Arrays.sort(answer);
        return answer;
    }
}