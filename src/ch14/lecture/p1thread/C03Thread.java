package ch14.lecture.p1thread;

public class C03Thread {
    public static void main(String[] args) {
        // Thread 만들기
        // 1.Thread 클래스 상속
        //   run 메소드 재정의
        // 2.Runnable 인터페이스 구현
        //   run 추상메소드 재정의

        // Thread 시작하기
        MyThread3 myThread3 = new MyThread3();
        myThread3.start(); // Thread 시작하기
        // JVM이 알아서 적절하게 run메소드를 시작시킴

        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }

    }
}

// 1.Thread 클래스 상속
//   run 메소드 재정의
class MyThread3 extends Thread {
    @Override
    public void run() {
        // 이 Thread가 할 일
        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
        }

    }
}
