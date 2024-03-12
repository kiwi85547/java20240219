package ch16.sec02.exam01;

@FunctionalInterface
public interface Workable {
    void work();
}

@FunctionalInterface
interface Speakable {
    void speak();
}

class Person {
    public void action1(Workable workable) {
        workable.work();
    }

    public void action2(Speakable speakable) {
        speakable.speak();
    }
}

class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.action1(() -> {
            System.out.println("abcd");
            System.out.println("실행문 두 개");
        });
        person.action2(() -> System.out.println("실행문 한 개"));
    }
}