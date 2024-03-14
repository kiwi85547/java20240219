package ch12.exercise.p5;


import java.util.HashSet;
import java.util.Objects;

class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    //재정의 해야함
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }
}

public class StudentExample {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();

        // set는 집합
        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));

        // 2개만 나오게! add는 있을때는 추가가 안됨
        System.out.println("저장된 Student 수 : " + hashSet.size());
    }
}
