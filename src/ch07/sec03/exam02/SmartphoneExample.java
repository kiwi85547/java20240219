package ch07.sec03.exam02;

public class SmartphoneExample {
    public static void main(String[] args) {
        SmartPhone myphone = new SmartPhone("Iphone", "silver");

        System.out.println(myphone.model);
        System.out.println(myphone.color);
    }
}

class Phone {
    public String model;
    public String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone.Phone");
    }
}

class SmartPhone extends Phone {
    public String model = "black";

    public SmartPhone(String model, String color) {
        super(model, color);
        System.out.println("smartphone 생성자 실행");
    }
}