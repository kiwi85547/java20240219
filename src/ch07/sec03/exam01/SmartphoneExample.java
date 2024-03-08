package ch07.sec03.exam01;

public class SmartphoneExample {
    public static void main(String[] args) {
        SmartPhone myphone = new SmartPhone("Galaxy", "white");

        System.out.println(myphone.model);
        System.out.println(myphone.color);
    }
}

class Phone {
    public String model;
    public String color;

    public Phone() {
        System.out.println("Phone.Phone");
    }
}

class SmartPhone extends Phone {
//    public String model = "black";

    public SmartPhone(String model, String color) {
        super(); // 생략 가능
        this.model = model;
        this.color = color;
        System.out.println("실행");
    }
}