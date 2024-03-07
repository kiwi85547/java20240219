package ch07.lecture.p2polymorphism;

public class C03Animalas {
    public static void main(String[] args) {
        C03Fish fish = new C03Fish();
        fish.breathe();

        C03Cat cat = new C03Cat();
        cat.breathe();
        cat.walk();

        C03Animal animal = fish;
        animal.breathe();
//        animal.swim(); 실행 안됨. animal에 어떤 기능이 있는지 모르니까
    }

}

class C03Animal {
    public void breathe() {
        System.out.println("호흡");
    }
}

class C03Fish extends C03Animal {
    @Override
    public void breathe() {
        System.out.println("아가미 호흡");
    }

    public void swim() {
        System.out.println("헤엄치다");
    }
}

class C03Cat extends C03Animal {
    @Override
    public void breathe() {
        System.out.println("폐 호흡");
    }

    public void walk() {
        System.out.println("걷다");
    }
}