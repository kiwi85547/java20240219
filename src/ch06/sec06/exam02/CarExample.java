package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car mycar = new Car();

        System.out.println("제작회사: " + mycar.company);
        System.out.println("모델명: " + mycar.model);
        System.out.println("색깔: " + mycar.color);
        System.out.println("최고속도: " + mycar.maxSpeed);
        System.out.println("현재속도: " + mycar.speed);

        mycar.speed = 60;
        System.out.println("수정된 속도: " + mycar.speed);
    }
}
