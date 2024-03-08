package ch07.lecture.p7object;

import java.math.BigDecimal;
import java.util.Scanner;

public class C02Object {
    public static void main(String[] args) {
        // 우리가 어떤 인스턴스를 만들던간에 Object를 상속받았다
        int[] arr1 = new int[3];
        String s1 = "java";
        Scanner scanner = new Scanner("");
        BigDecimal bd = new BigDecimal('3');

        // object에는 뭐든지 할당?할 수 있다
        // 모든 타입의 상위타입이다.
        // 실제 실행되는건 인스턴스...땡땡땡.. 12장에서 나옴
    }

    public static void handleInstance(Object o) {

    }


}
