package ch15.sec02.exam02;

import ch15.sec02.exam01.Board;

import java.sql.Array;
import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
//        List<Board> list = new Vector<>(); // 가능
//        List<Board> list = new ArrayList<>(); // 총 객체수가 2000이 안됨
        List<Board> list = Collections.synchronizedList(new ArrayList<>()); //가능

        Thread threadA = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };
        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };
        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
        }

        int size = list.size();
        System.out.println("총 객체수: " + size);
        System.out.println();
    }
}
