package ch04.lecture.p4for;

public class C03For {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i); //변수 i 사용가능
        }
        // System.out.println("i = " + i);
        // 변수 선언이 for문 안에서 일어났으므로 for문 밖에서는 변수 i 사용 못함

        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("i = " + i); //변수 i 사용가능
        }
        System.out.println("i = " + i); // i 사용 가능
    }
}
