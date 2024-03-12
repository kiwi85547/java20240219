package ch09.sec07.exam01;

public class Tire {
    public void roll() {
        System.out.println("타이어 roll");
    }
}

class Car {
    private Tire tire1 = new Tire();
    private Tire tire2 = new Tire() {
        // 중첩클래스
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire 객체 1 roll");
        }
    };

    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    public void run2() {
        // Tire 클래스의 상속과 인스턴스 생성
        Tire tire = new Tire() { //로컬클래스
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 2 roll");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) { //어떤 객체든지 상관없다.
        // 상속받든 아니든 다 Tire이 있으니까
        tire.roll();
    }
}