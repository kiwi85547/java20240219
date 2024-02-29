package ch05.lecture.p2String;

public class C08IndexOf {
    public static void main(String[] args) {
        String s1 = "java, spring, css, spring, java";
        int i1 = s1.indexOf("java"); //0
        int i2 = s1.indexOf("ring"); //8
        int i3 = s1.indexOf("html"); //-1

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);

        boolean re = s1.contains("in");
        System.out.println("re = " + re);
    }
}
