package ch02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        // char (character)
        // 2byte == 16bit
        // 0~65535
        // unicode

        char a = 99;
        char b = 9679; //유니코드를 10진수로 변환하여 출력 가능
        char c = 10155;
        char d = 4314;
        char e = 8258;
        char f = 0x056F; //16진수로 출력 가능
        char g = 'c';
        char h = 0xAC05;
        char i = '가';
//        char h = ;
//        char d=65536;
//        char e= =1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);

        //2바이트가 넘는 유니코드는 int로 변환시켜야 함
        int o = 0x1F607;
        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println("emojis = " + emojis);

        //1f3a4 이모지 출력
        int j = 0x1f3a4;
        char[] emoji2 = Character.toChars(j);
        String emoji = new String(emoji2);
        System.out.println("emoji = " + emoji);

        char c1 = 'A';
        char c2 = 65;
        char c3 = '가';
        char c4 = 44032;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

    }
}
