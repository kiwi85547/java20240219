package ch11.sec11.exam01;

public class getClassExample {
    public static void main(String[] args) {
        Class clazz = Car.class;

        System.out.println(clazz.getPackage().getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());
    }
}

class Car {
}
