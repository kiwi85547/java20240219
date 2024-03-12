package ch16.sec04;

@FunctionalInterface
public interface Calcuable {
    double calc(double x, double y);
}

class Person {
    public void action(Calcuable calcuable) {
        double result = calcuable.calc(10, 4);
        System.out.println("결과 : " + result);
    }
}

class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });
        person.action((x, y) -> x + y);
        person.action((x, y) -> sum(x, y));
        person.action(LambdaExample::sum); // 더 줄여서 쓸 수 있음
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}