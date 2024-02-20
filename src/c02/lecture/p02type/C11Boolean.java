package c02.lecture.p02type;

public class C11Boolean {
    public static void main(String[] args) {
        // boolean (논리형, 부울형, 불리언)
        // 값 : true, false
        // 크기 :1byte

        boolean a = true;
        boolean b = false;

        if (a) {
            System.out.println("안녕하세요");
        }
        if (b) {
            System.out.println("반갑습니다.");
        }

        boolean stop = true;
        if (stop) {
            System.out.println("중지합니다");
        } else {
            System.out.println("시작합니다.");
        }

        int x = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println(result1);
        System.out.println(result2);

        if (x == 2) {
            System.out.println("aa");
        } else {
            System.out.println("2가 아님");
        }
    }
}
