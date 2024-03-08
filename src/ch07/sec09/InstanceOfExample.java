package ch07.sec09;

public class InstanceOfExample {
    // main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        if (person instanceof Student student) {
            System.out.println("studentNo = " + student.sudentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("홍길동222");
        personInfo(p1);
        System.out.println();

        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }

}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("걷습니다");
    }
}

class Student extends Person {
    public int sudentNo;

    public Student(String name, int studentNo) {
        super(name);
        this.sudentNo = studentNo;
    }

    public void study() {
        System.out.println("공부를 합니다");
    }
}
