package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setGas(5);
        if (myCar.isLeftGas()) {
            System.out.println("출발합니다");
            myCar.run();
        }
        System.out.println("가스 주입 필요");
    }
}

class Car {
    int gas; // 필드 선언

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        return gas != 0;
        /*if (gas == 0) {
            System.out.println("gas가 없습니다");
            return false;
        }
        System.out.println("gas가 있습니다");
        return true;*/
    }

    void run() {
        while (true) {
            if (gas > 0) { // gas가 0보다 큰 동안 gas를 1씩 줄임
                System.out.println("달립니다 " + gas);
                gas--;
            } else {
                System.out.println("멈춥니다 " + gas);
                return;
            }

        }
//        while (gas > 0) {
//            gas--;
//        } 이렇게 써도 됨
    }
}