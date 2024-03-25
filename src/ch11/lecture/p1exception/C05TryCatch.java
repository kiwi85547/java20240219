package ch11.lecture.p1exception;

import java.util.List;

public class C05TryCatch {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");

        try {
            for (int i = 0; i <= list.size(); i++)
                System.out.println("exception 발생 전 실행 코드" + list.get(i));

            System.out.println("exception이 발생하지 않았으면");
            System.out.println("실행되는 코드들..!");
        } catch (Exception e) {
            // 어떤 exception 발생했는지 출력하는 코드가 있어야
            // 어떤 코드가 잘못됐는지 알 수 있음
            System.err.println("예외 발생");
            e.printStackTrace(); // 별일 없으면 catch 에서 꼭 작성

        }
        System.out.println("나머지 코드들..");
    }
}
