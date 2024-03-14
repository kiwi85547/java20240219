package ch13.lecture.p1generic;

public class C04Polymorphism {
    public static void main(String[] args) {
        C04Box<Number> box1 = new C04Box<>();
        C04Box<Integer> box2 = new C04Box<>();
        C04Box<Double> box3 = new C04Box<>();
        C04Box<Short> box4 = new C04Box<>();

        box1.someMethod();
    }
}

// 제한된 타입파라미터
class C04Box<T extends Number> {
    private T item;

    public void someMethod() {
        // Objcet의 메소드는 안전하게 사용 가능
        System.out.println(item.hashCode());
        System.out.println(item.toString());
        System.out.println(item.equals(null));
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}