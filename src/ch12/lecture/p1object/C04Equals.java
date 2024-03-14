package ch12.lecture.p1object;

public class C04Equals {
    public static void main(String[] args) {
        C04Book book1 = new C04Book("스프링 부트3");
        C04Book book2 = new C04Book("이것이 자바다");
        C04Book book3 = book2;
        C04Book book4 = new C04Book("이것이 자바다");

        System.out.println(book4.equals(book1)); //false
        System.out.println(book4.equals(book3)); //false
        System.out.println(book3.equals(book2)); //true
    }
}

class C04Book {
    private String title;

    public C04Book(String title) {
        this.title = title;
    }

    //equals 메소드가 있음. 우리 눈에 안보일뿐.
    //재정의하지 않았을뿐!

    // 참조값이 같지 않아도 이름이 같으면 true라고 나오게 하고 싶다면? 재정의!

    @Override
    public boolean equals(Object obj) {
        C04Book other = (C04Book) obj;
        return this.title.equals(title);
    }
}