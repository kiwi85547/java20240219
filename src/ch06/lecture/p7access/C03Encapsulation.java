package ch06.lecture.p7access;

public class C03Encapsulation {
    public static void main(String[] args) {
        C03MyClass obj = new C03MyClass();
//        obj.name; //x
//        System.out.println(obj.name); //x
        obj.getName();
        obj.setName("s");
        obj.setAge(42);
    }
}

class C03MyClass {

    // 필드
    private String name;
    private int age;

    // 메소드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}