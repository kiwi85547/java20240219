package ch09.sec06.exam01;

public class Button {
    // 정적 멤버 인터페이스
    public static interface ClickListener {
        // 추상 메소드
        void onClick();
    }

    // 필드
    // 인터페이스 타입의 객체 넣기
    private ClickListener clickListener;

    // 메소드
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    // Button이 클릭되었을 때 실행하는 메소드 선언
    // ClickListener 인터페이스 필드를 이용해서 oncClick()추상메소드를 호출한다.
    // 실제 실행은 구현된 클래스의 인스턴스메소드
    // clickListener(?)가 보장이 됨
    public void click() {
        this.clickListener.onClick();
    }
}
