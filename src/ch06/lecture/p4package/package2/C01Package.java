package ch06.lecture.p4package.package2;

import ch06.lecture.p4package.package1.C01MyClass;

public class C01Package {
    public static void main(String[] args) {
        // 다른 패키지에 있는 클래스는 full name 써야 함
//        ch06.lecture.p4package.package1.C01MyClass o1=new ch06.lecture.p4package.package1.C01MyClass();
        C01MyClass o2 = new C01MyClass();
        o2.a();
    }
}
