package ch09.sec07.exam02;

public interface RemoteControl {
    void turnOn();

    void turnOff();
}

class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV on");
        }

        @Override
        public void turnOff() {
            System.out.println("TV off");
        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        RemoteControl rc = new RemoteControl() {
            // 클래스 구현과 인터페이스 구현을 한번에
            @Override
            public void turnOn() {
                System.out.println("에어컨 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        // 안전하게 쓸 수 있다
        rc.turnOn();
        rc.turnOff();
    }
}