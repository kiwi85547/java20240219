package ch06.lecture.p7access;

import org.w3c.dom.ls.LSOutput;

public class C06ReadOnly {
    // 읽기 전용 만들기
    public static void main(String[] args) {
        C06MyClass1 o1 = new C06MyClass1("hy", 33);
        System.out.println(o1.getAge());


    }
}

// record : 14버전 이후
class C06MyClass1 {
    private String name;
    private int age;

    public C06MyClass1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
