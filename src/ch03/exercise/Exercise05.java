package ch03.exercise;

public class Exercise05 {
    public static void main(String[] args) {
        int lT = 5, lB = 10, height = 7;

        double area1 = (lB + lT) * height / 2;
        System.out.println("area1 = " + area1);

        double area2 = (lB + lT) * height * 1.0 / 2;
        System.out.println("area2 = " + area2);

        double area3 = (double) (lB + lT) * height / 2;
        System.out.println("area3 = " + area3);

        double area4 = (double) ((lB + lT) * height / 2);
        System.out.println("area4 = " + area4);
    }
}
