package ch05.lecture.p3enum;

public class C01Enum {
    public static void main(String[] args) {
        MyEnum1 v = MyEnum1.VALUE1;
        MyEnum1 x = MyEnum1.MY_ENUM_1VALUE2;
        MyEnum1 y = MyEnum1.MY_ENUM_1VALUE2;
        MyEnum1 z = MyEnum1.YOUR_VALUE;

        System.out.println(x == y); //true 같은 객체
    }
}

enum MyEnum1 {
    VALUE1,
    MY_ENUM_1VALUE2, // UPPER_SNAKE_CASE
    YOUR_VALUE
}