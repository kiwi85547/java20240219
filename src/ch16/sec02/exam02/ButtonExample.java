package ch16.sec02.exam02;

class Button {
    // 함수형 인터페이스
    //함수형 인터페이스는 하나의 추상 메소드만을 가지고 있으며 람다 표현식을 사용할 수 있습니다.
    @FunctionalInterface
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        clickListener.onClick(); //  clickListener의 onClick 메소드를 호출. 인터페이스의 메소드를 호출
        // this 생략가능
    }
}

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();//추상메소드를 구현한 땡땡.. 못들음..
        btnOk.setClickListener(() -> System.out.println("버튼 클릭했어요"));
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> System.out.println("Cancel 버튼 클릭"));
        btnCancel.click();
    }
}
