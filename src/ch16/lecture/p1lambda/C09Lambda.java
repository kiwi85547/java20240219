package ch16.lecture.p1lambda;

public class C09Lambda {
    //4. 리턴이 있는 추상 메소드
    public static void main(String[] args) {
        C09MyInterface obj = new C09MyInterface() {
            @Override
            public int method() {
                System.out.println("s....");
                return 0;
            }
        };
        // 여러줄 return 쓴다.
        C09MyInterface obj2 = () -> {
            System.out.println("s....");
            return 0;
        };
        // return 쓰면 안됨.
        C09MyInterface obj3 = () -> 0;
    }
}

@FunctionalInterface
interface C09MyInterface {
    int method();
}