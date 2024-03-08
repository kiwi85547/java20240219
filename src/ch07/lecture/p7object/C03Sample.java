package ch07.lecture.p7object;

public class C03Sample {
    public static void main(String[] args) {
        Shape shape1 = new Round(3); // 반지름 3
        Shape shape2 = new Rectangle(5, 7); // 가로5,세로7
        shape1.printArea(); // 원의 면적 출력
        shape2.printArea(); // 사각형 면적 출력

        printDescription(shape1); // "반지름이 3인 원의 면적은 ..입니다"
        printDescription(shape2); // "가로 5, 세로7인 사각형의 면적은 35입니다."
    }

    private static void printDescription(Object o) {
        System.out.println(o.toString());
    }
}

abstract class Shape {
    public abstract void printArea();
}

class Round extends Shape {
    int radius;
    double area;
    double roundVal;

    public Round(int radius) {
        this.radius = radius;
        roundVal = radius * radius * Math.PI; // ok!!!!
    }

    @Override
    public void printArea() {
        System.out.println(roundVal);
        this.area = radius * radius * Math.PI;
        System.out.println(area);
    }

    public String toString() {
        return STR."반지름이 \{radius}인 면적은 \{area}입니다.";
    }

}

class Rectangle extends Shape {
    int length1;
    int length2;

    public Rectangle(int length1, int length2) {
        this.length1 = length1;
        this.length2 = length2;
        int recVal = length1 * length2;
    }

    @Override
    public void printArea() {
        System.out.println(length1 * length2);
    }

}