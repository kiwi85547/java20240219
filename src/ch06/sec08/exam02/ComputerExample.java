package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        // sum() 메소드 호출 시 매개값 1,2,3을 제공하고
        // 합산 결과를 리턴받아 result1 변수에 저장
        int result1 = myCom.sum(1, 2, 3);
        System.out.println("result1 = " + result1);

        // sum() 메소드 호출 시 매개값 1,2,3,4,5을 제공하고
        // 합산 결과를 리턴받아 result1 변수에 저장
        int result2 = myCom.sum(1, 2, 3, 4, 5);
        System.out.println("result2 = " + result2);


    }
}
