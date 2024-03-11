package ch08.lecture.p1interface;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C08String {
    public static void main(String[] args) {
        String s = "java";
        Object o = s;
        System.out.println(s instanceof String);
        System.out.println(s instanceof Object);
        System.out.println(s instanceof Serializable);

        CharSequence charSequence = s;
        System.out.println(charSequence instanceof CharSequence); //true
        System.out.println(charSequence instanceof String); //true
        System.out.println(charSequence instanceof Serializable); //true
        System.out.println("object = " + o);
        System.out.println("string = " + s);
        Serializable serializable = s;
        System.out.println("serializable = " + serializable);

        System.out.println("charSequence = " + charSequence);
        Comparable comparable = s;
        Constable constable = s;
        ConstantDesc constantDesc = s;
        System.out.println("s = " + s);

        comparable.compareTo("hello");
        // 실제 인스턴스는 s, String이다.
        System.out.println("---------------");
        charSequence.chars();

        System.out.println(s instanceof String);
        System.out.println(s instanceof Object);
        System.out.println(s instanceof Serializable);

        System.out.println(charSequence instanceof CharSequence);
        System.out.println(charSequence instanceof String); //true
        System.out.println(charSequence instanceof Serializable); //true

        // 실제 인스턴스가 스트링이므로


    }
}
