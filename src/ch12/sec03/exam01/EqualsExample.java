package ch12.sec03.exam01;

class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        //obj가 Member 타입인지 검사하고 타입 변환 후 target 변수에 대입
        //obj타입이니까 Member로 형변환
        if (obj instanceof Member target) {
            return this.id.equals(target.id);
        }
        return false;
//            Member target = (Member) obj;
        //id 문자열이 같은지 비교
            /*if (id.equals(target.id)) {
                return true;
            }
        }return false;
        */
    }


}

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        if (obj1.equals(obj3)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}