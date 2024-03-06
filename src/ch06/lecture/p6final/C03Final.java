package ch06.lecture.p6final;

public class C03Final {
    public static void main(String[] args) {
        C03MyClass o1 = new C03MyClass();
        System.out.println(o1.i);
//        o1.j=20; // x
        System.out.println(o1.j);
//        o1.k=20; // x
        System.out.println(o1.k);
    }
}

class C03MyClass {
    int i;
    final int j = 10;
    final int k;

    C03MyClass() {
        // 생성자에서 인스턴스 필드 초기화
        this.k = 300; // this 있어도 되고 없어도 됨
    }


}