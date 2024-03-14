package ch16.exercise.p8;

public interface Function<T> {
    public double apply(T t); // T라는 타입
}

class Student {
    private String name;
    private int englishScore;
    private int mathScore;

    public Student(String name, int englishScore, int mathScore) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

}

class Example {
    private static Student[] students = {
            new Student("HY", 100, 100),
            new Student("HM", 100, 90)
    };

    //avg()메소드 작성
    //Function 인터페이스
    // 3/13일 2시 20분 설명
    private static double avg(Function<Student> function) {
        double sum = 0.0;
        for (Student student : students) {
//            sum+=student.getEnglishScore();
            sum += function.apply(student);
        }
        return sum / students.length;
    }


    public static void main(String[] args) {
        double englishAvg = avg(Student::getEnglishScore);
        System.out.println("englishAvg = " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("mathAvg = " + mathAvg);
    }
}
