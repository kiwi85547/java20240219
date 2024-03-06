package ch06.lecture.p3constructor;

public class C09DefaultConstructor {
    public static void main(String[] args) {
        C09MyClass3 o = new C09MyClass3(); // 객체 생성 가능
    }
}

//Class C09MyClass4{
//// 필요하면 만들어서 써야 함
//public C09MyClass4() {
//}
//
//public C09MyClass4(int age) {
//    int age;
//    this.age = age;
//}
//        }


class C09MyClass1 {


}

class C09MyClass2 {
}

class C09MyClass3 {
    // 필드 x
    // 생성자 x
    // 생성자를 작성하지 않으면(*)
    // 파라미터 없는 생성자 자동 추가(default constructor)
    // no-args constructor
    // 파라미터 없는 생성자, 기본생성자
    // 단, 생성자를 작성하면 추가하지 않음???
    // 메소드 x
}
