package ch07.sec09;

public class Instanceof1 {
    public static void personInfo(Person person) {
        System.out.println("Instanceof1.personInfo");
        person.walk();
        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println(student.sudentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("화영");
        personInfo(p1);
        System.out.println();

        Person p2 = new Student("길동", 100);
        personInfo(p2);
    }

}
