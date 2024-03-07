package ch07.lecture.p2polymorphism;

public class C02Polymorphism {
    public static void main(String[] args) {
        C02Cat cat = new C02Cat();
        cat.breath();
        C02Animal animal = cat;
        animal.breath(); // 인스턴스 메소드가 실행됨

        C02Animal animal1 = new C02Animal();
        C02Animal animal2 = new C02Cat();

        animal1.breath();
        animal2.breath();
    }
}

class C02Animal {
    void breath() {
        System.out.println("호흡합니다");
    }
}

class C02Cat extends C02Animal {
    @Override
    void breath() {
        System.out.println("폐로 호흡합니다");
    }
}
