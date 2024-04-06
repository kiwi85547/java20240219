package ch12.lecture.p5annotation;

import java.lang.annotation.Target;

public class C06Annotation {
    @MyAnnotation6(value = "hello",data={4,5})
    String name;
    @MyAnnotation0(value={"가","나"})
    @MyAnnotation6(data =6)
    int age;
}

@interface MyAnnotation6{String value() default "model" ; int[] data();}
@interface MyAnnotation0{String[] value();}