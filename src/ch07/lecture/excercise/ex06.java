package ch07.lecture.excercise;

public class ex06 {

}

class Parent {
    public String name;

    public Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    public int studentNo;

    public Child(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }
}