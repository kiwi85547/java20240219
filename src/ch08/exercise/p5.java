package ch08.exercise;

public class p5 implements Remocon {
    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다.");
    }

    public static void main(String[] args) {
        Remocon remocon = new p5();
        remocon.powerOn();
    }
}

interface Remocon {
    public void powerOn();
}