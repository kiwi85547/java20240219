package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox2 = new Stack<>();
        var coinBox = new Stack<Coin>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(10));

        String s = "ab#c";
        s.toCharArray();
        
        System.out.println(s.toCharArray());

        while (!coinBox.isEmpty()) { //비어있지 않다면 반복
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전: " + coin.getValue());
        }

    }
}

class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}