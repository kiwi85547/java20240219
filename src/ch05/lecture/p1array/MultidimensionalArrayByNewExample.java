package ch05.lecture.p1array;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        // 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
        int[][] mathScores = new int[2][3];
        // 배열 항목 초기값 출력
        for (int i = 0; i < mathScores.length; i++)
            for (int j = 0; j < mathScores[i].length; j++)
                System.out.println("mathScores[" + i + "][" + j + "] : " + mathScores[i][j]);
        System.out.println();
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        for (int i = 0; i < mathScores.length; i++)
            for (int j = 0; j < mathScores[i].length; j++)
                System.out.println("mathScores[" + i + "][" + j + "] : " + mathScores[i][j]);
        System.out.println();

        //전체 학생의 수학 평균 구하기
        int totalstudent = 0;
        int totalmathsum = 0;
        for (int i = 0; i < mathScores.length; i++) {
            totalstudent += mathScores[i].length;
            for (int j = 0; j < mathScores[i].length; j++) {
                totalmathsum += mathScores[i][j];
//                totalstudent += mathScores[i].length; // 여기에 넣으면 3 *6 =18. 18번 실행됨
            }
        }
        double totalMathAvg = (double) totalmathsum / totalstudent;
        System.out.println("전체 학생 수 = " + totalstudent);
        System.out.println("전체 학생의 수학 평균 점수 : " + totalMathAvg);

        // 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) {
                System.out.println("englishScores[][] : " + englishScores[i][k]);
            }
        }
        englishScores[0][0] = 90;
        englishScores[0][1] = 91;

        totalstudent = 0;
        int totalEnglishSum = 0;
        for (int i = 0; i < englishScores.length; i++) {
            totalstudent += englishScores[i].length;
            {
                for (int j = 0; j < englishScores[i].length; j++)
                    totalEnglishSum += englishScores[i][j];
            }
        }
        System.out.println("totalEnglishSum = " + totalEnglishSum);

    }
}