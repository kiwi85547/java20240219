package ch13.sec02.exam03;

class Box<T> {
    public T content;

    public boolean compare(Box<T> other) {
        boolean result = content.equals(other.content);
        return result;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        // 타입 파라미터에 타입을 명시하지 않으면 Object로 결정됨
        Box box1 = new Box();
        box1.content = "100";

        Box box2 = new Box();
        box2.content = "100";

        Box box3 = new Box();
        box3.content = 100;

        boolean result1 = box1.compare(box2);
        System.out.println("result1 = " + result1);

        boolean result2 = box1.compare(box3);
        System.out.println("result2 = " + result2);


    }
}
