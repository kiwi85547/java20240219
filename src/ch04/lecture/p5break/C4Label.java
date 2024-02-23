package ch04.lecture.p5break;

public class C4Label {
    public static void main(String[] args) {
        // 한번 듣고 잊어버려도 됨
        // label : 반복문에 label을 붙여서 break로 종료시킬 수 있다.

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(STR."(\{i},\{j})");
                if (j == 5)
                    break;
            }
        }
    }
}
