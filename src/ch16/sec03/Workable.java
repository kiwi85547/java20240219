package ch16.sec03;

@FunctionalInterface
public interface Workable {
    void work(String name, String job);
}

@FunctionalInterface
interface Speakable {
    void speak(String content);
}

class Person {
    public void action1(Workable workable) {
        workable.work("ksh", "Security");
    }

    public void action2(Speakable speakable) {
        speakable.speak("KB");
    }
}

class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> {
            System.out.println(name + "입니다.");
            System.out.println(job);
        });
        person.action2((job) -> System.out.println("job = " + job));
        person.action2(job -> {
            System.out.println("LambdaExample.main");
        });
    }
}