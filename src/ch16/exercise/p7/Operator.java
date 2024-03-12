package ch16.exercise.p7;

public interface Operator {
    public int apply(int x, int y);
}

class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
//            result = result>score?result:score; // 여기서 최대값만 구할 때
        }
        return result;
    }

    public static void main(String[] args) {
//        int max = maxOrMin(((x, y) -> x > y ? x : y));  // 가능
//        int max = maxOrMin(((x, y) -> Math.max(x, y))); // 가능
        int max = maxOrMin(Math::max);
        System.out.println("max = " + max);
        int min = maxOrMin(((x, y) -> x < y ? x : y));
        System.out.println("min = " + min);
    }
}