package ch15.exercise.p10;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        var set = new TreeSet<Student>(); // 어떤 차이? 타입지정필요. 안하면 Object로 들어감~?
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("hong", 86));
        treeSet.add(new Student("white", 92));

//        Student student = treeSet.last();
        System.out.println("최고 점수: " + treeSet.last().score);
        System.out.println("최고 점수를 받은 아이디: " + treeSet.last().id);
    }
}

class Student implements Comparable<Student> {
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
    }
}