package ch08.exercise;

public class p6 {
    public static void printSound(Soundable soundable) {
        String sound = soundable.sound();
        System.out.println(sound);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        printSound(cat);
        printSound(new Dog());

    }
}

interface Soundable {
    public String sound();
}

class Cat implements Soundable {
    @Override
    public String sound() {
        return "야옹";
    }
}

class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍";
    }
}