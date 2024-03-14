package ch12.lecture.p1object;

public class C02ToString {
    public static void main(String[] args) {
        Object o1 = new C02MyClass1("cho", "Seoul", 33);
        System.out.println(o1.toString());
        System.out.println(o1);
    }
}

// Object의 toString()메소드
// 객체의 문자 표현
// 객체를 문자열로 표현한 값
// 객체의 문자정보가 중요한 경우에는 toString() 메소드를 재정의
// println은 toString 생략해도 된다
class C02MyClass1 {
    // 필드
    private String name;
    private String address;
    private int age;
    // 생성자

    public C02MyClass1(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }


    // 메소드

    // toString : 필드값 정보를 리턴


    @Override
    public String toString() {
        return "C02MyClass1{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}