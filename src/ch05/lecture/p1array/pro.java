package ch05.lecture.p1array;

import java.util.Arrays;

public class pro {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(strlist.length);
        System.out.println(strlist[0].length());
        System.out.println(strlist[1].length());
        System.out.println("------------------------------");
        int[] result;
        result = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            result[i] = strlist[i].length();
        }
        for (int item : result) {
            System.out.println(item);
        }
        System.out.println("-----------------------------");

        String message = "happy birthday!";
        System.out.println(message.length());
        int width;
        width = message.length() * 2;
        System.out.println("width = " + width);

    }
}
