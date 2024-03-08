package ch07.lecture.p3casting;

public class C01Casting {
    public static void main(String[] args) {
        Animal animal = new Tiger();
        animal.breathe();

        // casting : 강제형변환
        Tiger tiger = (Tiger) animal;
        tiger.roar();

        Animal animal2 = new Cat();
        animal2.breathe();

        Cat cat = (Cat) animal2;
        cat.meow();
    }
}

class Animal {
    public void breathe() {
        System.out.println("animal.breathe");
    }
}

class Tiger extends Animal {
    @Override
    public void breathe() {
        System.out.println("tiger.breathe");
    }

    public void roar() {
        System.out.println("tiger.roar");
    }
}

class Cat extends Animal {
    @Override
    public void breathe() {
        System.out.println("cat.breathe");
    }

    public void meow() {
        System.out.println("cat.roar");
    }
}