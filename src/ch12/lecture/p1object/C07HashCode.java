package ch12.lecture.p1object;

import java.util.Objects;

public class C07HashCode {
    public static void main(String[] args) {
        C07MyClass book1 = new C07MyClass("이것이 자바다");
        C07MyClass book2 = new C07MyClass("이것이 자바다");
        C07MyClass book4 = new C07MyClass("스프링 부트3");

        System.out.println(); //false

    }
}

class C07MyClass {
    // hashCode
    // 1. 같은 객체가 hashCode를 여러 번 호출해도 같은 값이 나와야함
    // 2. 두 객체가 equals로 같은 객체로 여겨지면 두 객체의 hashCode는 같아야함
    // 3. 두 객체가 equals로 같지 않더라도 두 객체의 hashCode는 같을 수도 있음(하지만 다르면 더 좋다)
    // 위와 같은 약속을 잡고 해시코드를 재정의 해야한다
    // 하지만 위의 내용을 외울필요는 없다. API와 인텔리제이 도움을 받아서 필드기준으로 재정의 하자

    private String title;

    public C07MyClass(String string) {
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //자기자신과 참조값이 같으면
        if (o == null || getClass() != o.getClass()) return false;

        C07MyClass that = (C07MyClass) o; //위에서 같은지 확인했으므로 형변환만 함

        return Objects.equals(title, that.title); //Objects는 안배운거
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}