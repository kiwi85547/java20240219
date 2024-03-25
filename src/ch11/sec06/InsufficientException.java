package ch11.sec06;

public class InsufficientException extends Exception {
    // 꼭 필요한 예외일때! Exception
//    아니면 RuntimeException
    public InsufficientException() {
    }

    public InsufficientException(String message) {
        super(message);
    }
}