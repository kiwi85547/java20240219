package ch05.lecture.p2String;

public class C05Replace {
    public static void main(String[] args) {
        // replace 특정 문자열을 바꾼 문자열을 리턴(원본 문자열이 바뀌지 않음)

        String str1 = "my name is son";
        String str2 = str1.replace("my", "your");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        String my_string = "Progra21Sremm3";
        System.out.println(my_string.charAt(6));

        String str = my_string;
        int s = 6;
        int e = 12;
        for (int i = s; i <= e; i++)
//            str.charAt(i) = my_string.charAt(i);
            System.out.println("str = " + str);

    }
}
