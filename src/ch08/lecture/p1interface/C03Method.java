package ch08.lecture.p1interface;

public class C03Method {
    public static void main(String[] args) {
        C03Pet pet1 = new C03Cat();
        C03Pet pet2 = new C03Cat();

        pet1.feed(); // 인스턴스 메소드 실행
        pet2.feed(); // 인스턴스 메소드 실행
    }
}

interface C03Pet {
    // 인터페이스의 메소드는 모두 추상 메소드
    // 몸통을 가질 수가 없다
    // 모두 추상이므로 abstract 생략 가능
    // public 생략 가능
    public abstract void feed();
}

abstract class C03Animal {
    abstract public void breathe();
}

class C03Cat extends C03Animal implements C03Pet {
    @Override
    public void breathe() {
        System.out.println("Cat Breathe");
    }

    @Override
    public void feed() {
        System.out.println("고양이에게 닭가슴살 주기");
    }
}

class C03Tiger extends C03Animal {
    @Override
    public void breathe() {
        System.out.println("Tiger Breathe");
    }
}

class C03GoldFish extends C03Animal implements C03Pet {
    @Override
    public void breathe() {
        System.out.println("Goldfish Breathe");
    }

    @Override
    public void feed() {
        System.out.println("금붕어에게 먹이 주기");
    }
}