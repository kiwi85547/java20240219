package ch11.exercise.p6;

public class p6 {
    public static void main(String[] args) {
        String[] array = {"10", "2a"};
        int value = 0;
        for (int i = 0; i <= 2; i++) {
            try {
                value = Integer.parseInt(array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스를 초과했음");
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없음");
            } finally {
                System.out.println("array[" + i + "]" + value);
            }
        }
    }
}