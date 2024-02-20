package c02.lecture.p02type;

public class C13String {
    public static void main(String[] args) {
        // String
        // 문자열 저장
        // ""로 값 표현

        String a = "Hey🤣";
        char b = 's';
        String c = "₥₥₲";
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        String name = "조화영";
        String job = "프로그래머";
        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println("str = " + str);
        str = "이름";
        System.out.println("str = " + str);
        System.out.println("나는\n 조화영입니다.");

        String t1 = "Hello";
        String t2 = "My name is\\화영\\";
        String t3 = "번호\t이름 \t 직업\n안녕";
        System.out.println("t2 = " + t2);
        System.out.print("t3 = " + t3);


    }
}
