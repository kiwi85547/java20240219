package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {
//        Singleton obj1 = new Singleton();

        // 정적 메소드를 호출해서 싱글톤 객체 얻음
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
    }
}

class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}