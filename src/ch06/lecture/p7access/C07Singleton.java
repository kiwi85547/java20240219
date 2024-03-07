package ch06.lecture.p7access;

public class C07Singleton {
    public static void main(String[] args) {

    }

}

class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    private static Singleton getInstance() {
        return singleton;
    }
}