package ch05.lecture.p1array;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
//        intArray[0] = 10;

        String str = null;
        System.out.println("str = " + str);
//        System.out.println("str길이 = " + str.length()); // null값이므로 길이가 없음

        String hobby = "여행";
        hobby = null;

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2 = " + kind2);

    }
}
