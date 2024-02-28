package ch05.lecture.p1array;

public class MultidimensionalArrayByValueListExample2 {
    public static void main(String[] args) {
        int[][] scores = {{80, 90, 96}, {76, 88}};
        int sum1 = 0;
        for (int score : scores[0]) {
            sum1 += score;
        }
        double avg1 = (double) sum1 / scores[0].length;
        System.out.println("avg1 = " + avg1);

        int sum2 = 0;
        for (int score : scores[0]) {
            sum2 += score;
        }
        double avg2 = (double) sum2 / scores[1].length;
        System.out.println("avg2 = " + avg2);

        int sumAll = 0;
        int numOfStudents = 0;
        for (int[] classScores : scores) {
            numOfStudents += classScores.length;
            for (int score : classScores) {
                sumAll += score;
            }
            System.out.println("classScores = " + classScores.length);
        }

        System.out.println("numOfStudents = " + numOfStudents);
        System.out.println("sumAll = " + sumAll);
        double avg = (double) sumAll / numOfStudents;
        System.out.println("avg = " + avg);
    }
}
