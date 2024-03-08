package ch07.lecture.p3casting;

public class C05InstanceOf {
    public static void main(String[] args) {
        A a = new E();

        System.out.println(a instanceof A); //true
        System.out.println(a instanceof B); //true
        System.out.println(a instanceof C); //true
        System.out.println(a instanceof D); //true
        System.out.println(a instanceof E); //true
        System.out.println(a instanceof F); //true


    }
}

// @formatter:off (자동줄바꿈 안되게)
class A{}
class B extends A{}
class C extends A{}
// @formatter:off (자동줄바꿈 가능)
class D extends B {}
class E extends C {}
class F extends B {}