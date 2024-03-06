package ch06.sec10;

public class TelevisionExample {
    public static void main(String[] args) {
        System.out.println(Television.info);
    }
}

class Television {
    static String company = "my company";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }
}