package ch16.lecture.p1lambda;

public class C06Lambda {
    //2. 매개변수가 1개 있고 리턴이 없는 추상 메소드
    public static void main(String[] args) {
        C06MyInterface obj = (a) -> {
            System.out.println("a = " + a);
            System.out.println("C06Lambda.main");
        };
        // 파라미터가 한개면 괄호 안써도 됨.
        C06MyInterface obj2 = a -> {
            System.out.println();
        };
        C06MyInterface obj3 = x -> System.out.println("x = " + x);
    }
}

interface C06MyInterface {
    void method(int a);
}