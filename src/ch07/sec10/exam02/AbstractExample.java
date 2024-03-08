package ch07.sec10.exam02;

public class AbstractExample {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.sound();
//
//        Cat cat = new Cat();
//        cat.sound();


        animalSound(new Dog());
//        animalSound(cat);
    }

    private static void animalSound(Animal animal) {
        animal.sound();
    }
}

abstract class Animal {
    public void breathe() {
        System.out.println("숨을 쉽니다");
    }

    abstract public void sound();
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}