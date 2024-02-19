package c02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {
        int value=20;

        int result=value+10;
        System.out.println(result);

        int hour=3;
        int minute=5;
        System.out.println(hour+"시간"+minute+"분");
        int totalMinute=(hour*60)+minute;
        System.out.println(totalMinute+"분");

        int x=3;
        int y=5;
        System.out.println("x: "+x+", y: "+y);

        int temp=x;
        x=y;
        y=temp;
        System.out.println("x: "+x+", y: "+y);

        int a=100;
        int b=200;
        //적절한 코드를 작성해서 a=200, b=100으로 만들기
        //swap a,b

        //임시저장공간을 만들기
        int temp2=a;
        a=b;
        b=temp2;

        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
}
