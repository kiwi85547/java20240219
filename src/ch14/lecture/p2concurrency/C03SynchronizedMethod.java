package ch14.lecture.p2concurrency;

public class C03SynchronizedMethod {
    public static void main(String[] args) {
        MyObject3 o = new MyObject3();
        Thread t1 = new Thread(o);
        Thread t2 = new Thread(o);


    }
}

class MyObject3 implements Runnable {
    private long value;

    public long getValue() {
        return value;
    }

    public void update() {
        for (int i = 0; i < 30000; i++) {
            value++;
        }
    }

    @Override
    public void run() {

    }
}