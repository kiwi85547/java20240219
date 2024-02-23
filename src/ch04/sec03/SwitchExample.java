package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        //1~6번까지 있는 주사위를 굴려서 나온 숫자를 말하기

        int val = (int) (Math.random() * 6) + 1;

//        Random random = new random(System.in);

        switch (val) {
            case 1:
                System.out.println("1번입니다");
                break;
            case 2:
                System.out.println("2번입니다");
                break;
            case 3:
                System.out.println("3번입니다");
                break;
            case 4:
                System.out.println("4번입니다");
                break;
            case 5:
                System.out.println("5번입니다");
                break;
            default:
                System.out.println("6번입니다");

        }
    }
}
