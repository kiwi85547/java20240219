package c02.lecture.p02type;

public class C18Scope {
    public static void main(String[] args) {
        // 변수는 선언된 블럭{} 안에서만 사용 가능 js)let
        // 변수를 사용하는 영역이 제한된다.

        int a = 3;
        if (true) {
            int b = 5;
            System.out.println("if 안");
            System.out.println(a);
            System.out.println(b);
        }
//        System.out.println(b); {}밖이어서 안됨.
        System.out.print(a);

        int v1 = 15;
        if (v1 > 10) {
            int v2 = v1 - 10;
            int v3 = v1 + v2 + 5;
            System.out.println("v1 = " + v1);

            System.out.println(v1);
            System.out.println(v2);
            System.out.println(v3);
        }

    }
}
