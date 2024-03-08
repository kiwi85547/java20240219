package ch07.lecture.p4abstract;

public class C02Abstract {
    public static void main(String[] args) {
        C02Animal a1 = new C02Fish();
        C02Animal a2 = new C02Cat();
//        C02Animal a3 = new C02Bird(); // x
        a1.breathe();
        a2.breathe();
    }
}

//@formatter:.off
abstract class C02Animal {
    // 있다는건 알겠는데 구현은 하위 클래스에서 해라
    // abstract method : body(몸통)가 없는 메소드
    // 하위클래스가 꼭 재정의 해야함
    // 추상메소드가 있다면 클래스는 꼭 추상 클래스여야 한다
    abstract public void breathe();
}

// 구현 클래스(concrete class)
class C02Fish extends C02Animal {
    @Override
    public void breathe() {
        System.out.println("아가미");
    }
}

class C02Cat extends C02Animal {
    @Override
    public void breathe() {
        System.out.println("폐");
    }
}

// 자식클래스가 추상 메소드를 재정의하지 않으면
// 추상 클래스가 되어야 함
abstract class C02Bird extends C02Animal {
}