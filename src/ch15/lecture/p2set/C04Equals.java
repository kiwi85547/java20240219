package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class C04Equals {
    public static void main(String[] args) {
        Set<C04Book> set = new HashSet<>();
        set.add(new C04Book("이것이 자바다"));
        set.add(new C04Book("이것이 자바다"));
        set.add(new C04Book("모두의 git"));

        System.out.println(set.size());
        // 객체가 다르더라도 같은 제목이면 지우고 싶다면
        // equals(), hashcode() 재정의
        // p.652 참고
    }
}

class C04Book {
    private String title;

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C04Book c04Book = (C04Book) o;
        return Objects.equals(title, c04Book.title);
    }
    // Constructor
    // Getter, Setter
    // toString

    public C04Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}