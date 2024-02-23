package ch04;

public class Sec02 {
    public static void main(String[] args) {
        //Math.random() 메소드는 0이상 1 미만의 double 타입의 값을 랜덤으로 뽑아준다.
        double num = Math.random();
        System.out.println("num = " + num);
        System.out.println((int) num);

        int random = (int) (Math.random() * 3) + 1;
        System.out.println("random = " + random);
    }
}
