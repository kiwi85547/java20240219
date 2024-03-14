package ch12.lecture.p1object;

public class C03Equals {
    public static void main(String[] args) {
        C03MyClass obj1 = new C03MyClass();
        C03MyClass obj2 = new C03MyClass();
        C03MyClass obj3 = obj2;

        boolean b1 = obj1.equals(obj2); //false
        boolean b2 = obj1.equals(obj3); //false
        boolean b3 = obj2.equals(obj3); //true

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o2;

        boolean a1 = o1.equals(o2); //false
        boolean a2 = o2.equals(o3); //true
        boolean a3 = o1.equals(o3); //false

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);

    }
}

class C03MyClass {
}