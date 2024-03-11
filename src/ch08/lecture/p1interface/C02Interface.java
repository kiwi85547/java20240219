package ch08.lecture.p1interface;

public class C02Interface {
    public static void main(String[] args) {
        C02Cat cat = new C02Cat();
        C02Tiger tiger = new C02Tiger();
        C02GoldFish goldFish = new C02GoldFish();


        C02Animal animal;
        animal = cat;
        animal = tiger;
        animal = goldFish;


        C02Pet pet;
        pet = cat;
        pet = goldFish;

        C02Aqua aqua;
        aqua = goldFish;

    }
}

// 상속관계와 상관없음. 인터페이스는 여러 관계 가능
interface C02Pet {
}

interface C02Aqua {
}

class C02Animal {
}

class C02Cat extends C02Animal implements C02Pet {
}

class C02GoldFish extends C02Animal implements C02Pet, C02Aqua {
}

class C02Tiger extends C02Animal {
}

