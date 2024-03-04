package ch06.lecture.p1field;

public class C02Field {
    public static void main(String[] args) {
        C02Car car1 = new C02Car(); // C02Car 클래스가 없으면 설계도가 없어서 객체를 만들 수 없음
        car1.color = "검은색";
        car1.weight = 999.99;

        C02Car car2 = new C02Car();
        car2.color = "흰색";
        car2.weight = 888.88;

        System.out.println(car1.color); // 설계도에 없어서 color를 실행 못함
        System.out.println(car1.weight); //설계도에 없어서 weight를 실행 못함
        System.out.println(car2.color);
        System.out.println(car2.weight);

    }
}
