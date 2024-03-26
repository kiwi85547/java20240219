package ch14.lecture.p2concurrency;

public class C02SynchronizedBlock {
    public static void main(String[] args) throws InterruptedException {
        MyObject2 obj = new MyObject2();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        obj.setLock(new Object());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.getValue());
    }
}

class MyObject2 implements Runnable {
    private long value;
    private Object lock;

    public void setLock(Object lock) {
        this.lock = lock;
    }

    public long getValue() {
        return value;
    }

    public void update() {
        for (int i = 0; i < 30000; i++) {
            synchronized (lock) { // 여러 쓰레드가 경합을 벌임
                // synchronized 블럭
                // ()괄호안의 객체를 차지한 쓰레드만 실행 가능
                value++;
            }
        }
    }

    // 여러 쓰레드가 동시에 참조할 수 있는 객체의 참조값
    @Override
    public void run() {
        update();
    }
}