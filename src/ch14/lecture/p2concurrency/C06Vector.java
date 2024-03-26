package ch14.lecture.p2concurrency;

import java.util.List;
import java.util.Vector;

public class C06Vector {
    public static void main(String[] args) throws InterruptedException {
        List<String> vector = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 30000; i++) {
                vector.add("A");
                vector.remove("A");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 30000; i++) {
                vector.add("B");
                vector.remove("B");
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("vector = " + vector);
    }
}
