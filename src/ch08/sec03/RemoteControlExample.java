package ch08.sec03;

public class RemoteControlExample {
    public static void main(String[] args) {
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUNE);
    }
}

interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUNE = 0;
}