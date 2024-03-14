package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("obj.intValue = " + obj.intValue());
        // obj.intValue() : 수동 언박싱

        int value = obj;
        System.out.println("value = " + value);

        // 참조타입과 기본타입의 연산
        // 참조타입 -> 기본타입으로 변환되어 연산
        // obj값에 null값 넣으면 에러 발생
        int result = obj + 100;
        System.out.println("result = " + result);


        Object o = 100; //
        Object p = 100; //

//        Object q = o + p ; //x
    }
}
