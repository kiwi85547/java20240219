package ch08.lecture.p1interface;

public class C04Static {
    public static void main(String[] args) {
        int age = C04My.AGE;
        age = 12;
        age = 15;
        System.out.println(age);
        System.out.println(C04My.AGE);
    }
}

interface C04My {
    //field
    // 모두 public static final 항상 대문자 스네이크케이스로 작성
    // 값을 꼭 한번 할당해야함
    public static final int AGE = 0;
    String NAME = "son hm";
    String MY_ADDRESS = "london";

}
