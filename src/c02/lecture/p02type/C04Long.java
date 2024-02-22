package c02.lecture.p02type;

public class C04Long {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        long var3 = 100000000;
        long var4 = 100000000L;
        long var5 = 9223372036854775807L;
        float flo1 = var5;
        float flo2 = 34000000000000000000000000000000000000F;
        float flo3 = -3400000000000000000000000000000000000F;
        System.out.println("flo1 = " + flo1);
        System.out.println("flo2 = " + flo2);
        System.out.println("flo3 = " + flo3);

        System.out.println(var5);
    }
}