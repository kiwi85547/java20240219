package ch06.lecture.p5static;

import java.util.Arrays;

//static import
//import static java.util.Arrays.fill;
//import static java.util.Arrays.sort;

// 클래스명 생략하고 클래스 멤버를 사용 가능하게 함
// 여러 멤버를 한번에
import static java.util.Arrays.*;

public class C03Static {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3};
        int[] brr = new int[5];
        fill(brr, 100); //Arrays. 생략
        sort(arr); //Arrays. 생략

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}
