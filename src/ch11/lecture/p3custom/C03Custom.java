package ch11.lecture.p3custom;

public class C03Custom {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        throw new BreakDoorHandleException("문고리가 고장남");
    }

}

// 직접 만드는 exception
// 1. Exception : checkedException 사용하는 쪽의 선택권이 강제되버림
// 꼭 이유가 있을 경우는 1번 해도 됨
// 2. RuntimeException : uncheckedException
class BreakDoorHandleException extends RuntimeException {
    BreakDoorHandleException() {
    } // 기본생성자도 만들기

    BreakDoorHandleException(String message) { // 조상인 RuntimeException 생성자를 호출
        super(message);
    }

    BreakDoorHandleException(Throwable t) { // 좀 더 정교한 생성자...
        super(t);
    }
}