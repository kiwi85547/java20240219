package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("조화영", 20),
                new Student("김수환", 30)
        );

        // 방법1
        Stream<Student> studentStream = list.stream();
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        double avg1 = scoreStream.average().getAsDouble();


        // 방법2
        double avg2 = list.stream()
                .mapToInt(s -> s.getScore())
                .average()
                .getAsDouble();

        // 방법3. 고전적 방법
        double sum = 0;
        for (Student student : list) {
            sum += student.getScore();
        }
        double avg3 = sum / list.size();

        System.out.println("avg1 = " + avg1);
        System.out.println("avg2 = " + avg2);
        System.out.println("avg3 = " + avg3);

    }

}