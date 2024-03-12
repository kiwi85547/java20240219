package ch09.exercise.p6;

public interface Vehicle {
    public void run();
}

class Anonymous {

    Vehicle field = new Vehicle() {    //Vehicle 타입 필드
        @Override
        public void run() {
            System.out.println("자동차가 달립니다.");
        }
    };

    void method1() {// 지역변수, 로컬변수
        Vehicle localVar = new Vehicle() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };
        localVar.run();
    }

    // 메소드의 매개값
    void method2(Vehicle v) {
        v.run();
    }
}

class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.run();
        anony.method1();
        anony.method2(new Vehicle() {
                          @Override
                          public void run() {
                              System.out.println("트럭이 달립니다");
                          }
                      }
        );
    }
}