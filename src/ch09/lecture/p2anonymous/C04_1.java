package ch09.lecture.p2anonymous;
// 한번 만들고 끝낼 때
// 자주 있는 일. 람다로 자주 씀

public class C04_1 {
    public static void main(String[] args) {
        C04_1Parent obj = new C04_1Parent() {
            @Override
            void method() {
                System.out.println("C04_1.method");
            }
            // 인스턴스 생성과 상속까지 한번에
        };
        obj.method();
    }
}

class C04_1Parent {
    void method() {
        System.out.println("C04Parent.method");
    }
}