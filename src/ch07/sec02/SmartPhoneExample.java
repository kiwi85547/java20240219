package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        // Phone으로부터 상속받은 필드 읽기
        System.out.println(myPhone.model);
        System.out.println(myPhone.color);

        System.out.println(myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("hello");
        myPhone.recieveVoice("who are you?");
        myPhone.sendVoice("It's me, hy");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
