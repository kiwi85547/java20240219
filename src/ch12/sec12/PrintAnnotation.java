package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface PrintAnnotation {
    String value() default "-"; int number() default 15;
}

class Service{
    @PrintAnnotation
    public void method1(){
        System.out.println("실행 내용1");
    }
    @PrintAnnotation("*")
    public void method2(){
        System.out.println("실행 내용2");
    }
    @PrintAnnotation(value="#",number=20)
    public void method3(){
        System.out.println("실행 내용3");
    }
}
