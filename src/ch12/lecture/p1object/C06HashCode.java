package ch12.lecture.p1object;

public class C06HashCode {
    public static void main(String[] args) {
        String o1 = new String("가");
        String o2 = new String("나");
        String o3 = o2;

        // 실제 오브젝트의 해시코드는 identityHashCode로 확인가능
        // String.hashcode 문자코드와 위치로 계산.. 재정의됨!
        System.out.println(o1.hashCode());


    }
}
