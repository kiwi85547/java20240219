package ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.company);
        System.out.println();
        Car car2 = new Car("Sonata");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println();
        Car car3 = new Car("Grandeur", "silver");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println();

        Car car4 = new Car("Genesis", "black", 200);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
        System.out.println();
    }
}

class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;


    Car() {
    }

    Car(String model) {
        this.model = model;
        // model = initialModel (파라미터도 initialModel로)
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}