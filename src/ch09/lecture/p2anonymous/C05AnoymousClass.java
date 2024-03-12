package ch09.lecture.p2anonymous;

public class C05AnoymousClass {
    public static void main(String[] args) {
//        C05Parent obj1 = new C05Parent(){
        // 이렇게 해도 같음.
        //추상메소드 있었으면 재정의 할 수 있음
        // 인스턴스 생성과 상속을 한번에
        method(new C05Parent() {
        });
//         void method(obj1); // 이거 어떻게 만드는걸까?
    }

    ;

    public static void method(C05Parent param) {

    }
}

class C05Parent {

}