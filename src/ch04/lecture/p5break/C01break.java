package ch04.lecture.p5break;

public class C01break {
    public static void main(String[] args) {
        // for, while, do-while
        // break : 반복문의 코드 블럭에서 break 실행 시 반복문 종료
        // 조건과 상관 없이 빠져나가야 할 때 쓰임

        boolean b = true;

        while (b) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            break;
//            System.out.println("bonus");
        }
        System.out.println("4");

    }
}
