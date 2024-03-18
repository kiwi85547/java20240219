package ch13.lecture.p1generic;

public class C08WildCard {
    public static void main(String[] args) {

    }

    public static void method1(C07Box<? extends Object> box) {
        Object o = box.getItem();
    }

    public static void method2(C07Box<?> box) { //box에서 읽으려는 목적으로 쓴다
        Object o = box.getItem();               // <? super T> 쓰려는 목적으로 썼다
    }
}
