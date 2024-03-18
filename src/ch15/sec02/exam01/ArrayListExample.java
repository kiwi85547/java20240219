package ch15.sec02.exam01;

import ch08.sec10.exam01.B;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList 컬렉션 생성
        List<Board> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        // 객체 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        list1.add("나는 조화영");
        list1.add("나는 김수아");
        list1.add("나는 김재후");
        list1.add("나는 김수환");

        // 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();
        System.out.println(list1);

        // 읽기(get)
        Board board = list.get(2);
        System.out.println(board.getSubject());

        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + b.getContent() + b.getWriter());
        }
        System.out.println();

        list.remove(2);
        list.remove(2);

        // 전체 탐색(향상된 for문)
        for (Board b : list) {
            System.out.println(b.getSubject() + b.getContent() + b.getWriter());
        }

        // 전체 탐색(lambda)
        list.forEach(System.out::println);

    }
}
