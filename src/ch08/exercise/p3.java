package ch08.exercise;

public class p3 {
    public static void main(String[] args) {
        CharSequence[] charSequences = new CharSequence[10];

        charSequences[0] = "java";
        charSequences[1] = new String("hello");

        charSequences[3].chars(); // 실제 실행은 String buffer를 실행시켜서.. 3월12일 오전9시24분

        charSequences[3].toString();
        charSequences[4].charAt(3);
    }
}
